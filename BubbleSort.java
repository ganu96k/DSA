import java.util.Scanner;

public class BubbleSort {

    // Optimized bubble sort logic with flag by Ganesh 
    public void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false; // Reset the flag for each pass
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set flag to true when a swap occurs
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort bsort = new BubbleSort();
        int[] arr = new int[10];

        System.out.println("Enter 10 integers separated by spaces:");
        // Read integers from the user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        bsort.bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close(); // Close the scanner
    }
}
