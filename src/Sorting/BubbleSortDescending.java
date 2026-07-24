package Sorting;

import java.util.Scanner;

public class BubbleSortDescending {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        } int k=0;
        while( k <n-1) {
            int j = k;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }k++;
        }

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }
    }
}
