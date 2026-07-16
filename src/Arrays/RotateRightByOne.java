package Arrays;


import java.util.Scanner;

public class RotateRightByOne {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int temp = arr[n - 1];

        for (int i = n - 1; i >= 1; i--) {

            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}