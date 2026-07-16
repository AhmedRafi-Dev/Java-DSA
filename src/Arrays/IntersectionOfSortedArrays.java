package Arrays;

import java.util.Scanner;

public class IntersectionOfSortedArrays {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] arr1 = new int[m];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] ans = new int[Math.min(n, m)];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {

            if (arr[i] < arr1[j]) {
                i++;
            }

            else if (arr[i] > arr1[j]) {
                j++;
            }

            else {
                ans[k] = arr[i];
                k++;
                i++;
                j++;
            }
        }

        System.out.println("Intersection:");

        if (k == 0) {
            System.out.println("No Common Elements");
        } else {
            for (int x = 0; x < k; x++) {
                System.out.print(ans[x] + " ");
            }
        }
    }
}