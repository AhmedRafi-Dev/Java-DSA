package Arrays;

import java.util.Scanner;

public class MissingNumber {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of array: ");

        int[] arr = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            arr[i] = scanner.nextInt();
        }int actualsum=0;
        for (int i = 1; i <=n ; i++) {
            actualsum=actualsum+i;
        }int wrongsum=0;
        for (int i = 0; i < n-1; i++) {
            wrongsum=wrongsum+arr[i];
        }
        int missingnumber=actualsum-wrongsum;
        System.out.println("The missing number is : "+missingnumber);

    }

}
