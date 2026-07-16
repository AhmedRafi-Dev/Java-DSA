package Arrays;

import java.util.Scanner;

public class UnionOfSortedArrays {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr1 = new int[m];

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {

            if (arr[i] < arr1[j]) {
                arr2[k] = arr[i];
                i++;
                k++;
            }

            else if (arr[i] > arr1[j]) {
                arr2[k] = arr1[j];
                j++;
                k++;
            }

            else {
                arr2[k] = arr[i];
                i++;
                j++;
                k++;
            }
        }

        while (i < n) {
            arr2[k] = arr[i];
            i++;
            k++;
        }

        while (j < m) {
            arr2[k] = arr1[j];
            j++;
            k++;
        }

        System.out.println("Union:");

        for (int x = 0; x < k; x++) {
            System.out.print(arr2[x] + " ");
        }
    }
}