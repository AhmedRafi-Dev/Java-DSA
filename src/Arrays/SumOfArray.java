package Arrays;

import java.util.Scanner;

public class SumOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
