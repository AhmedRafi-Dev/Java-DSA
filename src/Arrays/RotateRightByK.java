package Arrays;


import java.util.Scanner;

public class RotateRightByK {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter number of right rotations: ");
        int k= scanner.nextInt();
        int i=1;
        while(i<=k){
            int temp=arr[n-1];
            for (int j = n-1; j >=1 ; j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
            i++;
        }
        for (int j = 0; j <n ; j++) {
            System.out.println(arr[j]);
        }

    }
}
