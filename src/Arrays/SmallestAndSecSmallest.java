package Arrays;

import java.util.Scanner;

public class SmallestAndSecSmallest {
    static void main () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();


        System.out.println("Enter the element of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        } int smallest=arr[0];
        int secsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<smallest){
                secsmallest=smallest;
                smallest=arr[i];
            }
            if(arr[i]>smallest && arr[i]<secsmallest){
                secsmallest=arr[i];
            }
        }
        System.out.println("smallest element of array: "+smallest);
        System.out.println("Second smallest element of array: "+secsmallest);
    }
}
