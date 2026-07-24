package Sorting;

import java.util.Scanner;

public class BubbleSortSwapCount {

        static void main() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter size of Array: ");
            int n = scanner.nextInt();

            System.out.println("Enter the element of array: ");

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();

            }int count=0;
            int k = 0;
            while (k < n - 1) {

                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] > arr[i+1]) {
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        count++;
                    }
                }
                k++;
            }
            System.out.println("The Number of Swaps : "+count);
            for (int i = 0; i < n; i++) {

                System.out.println(arr[i]);
            }
        }
    }

