package Arrays;

import java.util.Scanner;

public class LargestElement {
        static void main () {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter size of Array: ");
            int n = scanner.nextInt();


            System.out.println("Enter the element of array: ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int largest = arr[0];
            for (int i = 1; i <n ; i++) {
                if(largest<arr[i]){
                    largest=arr[i];
                }
            }
            System.out.println(largest);
        }
}
