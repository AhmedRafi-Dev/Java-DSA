package Arrays;

import java.util.Scanner;

public class RotateLeftByK {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter number of left rotations: ");
        int k = scanner.nextInt();

        k = k % n;

        int i = 1;

        while (i <= k) {

            int temp = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = temp;

            i++;
        }

        System.out.println("Array after left rotation:");

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}