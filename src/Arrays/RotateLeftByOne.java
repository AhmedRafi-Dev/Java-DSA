package Arrays;

import java.util.Scanner;

public class RotateLeftByOne {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp=arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i]=arr[i+1];

        }
        arr[n-1] = temp;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

