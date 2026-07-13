package Arrays;

import java.util.Scanner;

public class LargestAndSecLargest {
        static void main () {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter size of Array: ");
            int n = scanner.nextInt();


            System.out.println("Enter the element of array: ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            } int largest=-1;
            int seclargest=-1;
            for (int i = 0; i < n; i++) {
                if(arr[i]>largest){
                    seclargest=largest;
                    largest=arr[i];
                }
                if(arr[i]<largest && arr[i]>seclargest){
                    seclargest=arr[i];
                }
            }
            System.out.println("Largest element of array: "+largest);
            System.out.println("Second Largest element of array: "+seclargest);
        }
}
