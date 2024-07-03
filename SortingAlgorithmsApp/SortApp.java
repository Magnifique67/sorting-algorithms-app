import java.util.Scanner;

public class SortApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.println("Enter a series of numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];

        // Convert input strings to integer
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        // Ask the user to choose the sorting algorithm
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        int choice = scanner.nextInt();

        // Sort the array based on the user's choice
        switch (choice) {
            case 1:
                bubbleSort(numbers);
                break;
            case 2:
                selectionSort(numbers);
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and choose either 1 or 2.");
                return;
        }

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Algorithm
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
