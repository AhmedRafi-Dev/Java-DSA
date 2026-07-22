package Arrays;

import java.util.Scanner;

public class LeadersInArray {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of array: ");

        int[] arr = new int[n ];

        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            boolean leader=true;
            for (int k = i+1; k < n; k++) {
                if(arr[i]<arr[k]){
                    leader=false;
                }

            }if(leader) {
                System.out.println(arr[i]);
            }
        }

    }
}
