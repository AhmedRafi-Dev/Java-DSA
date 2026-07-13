package Arrays;

import java.util.Scanner;

public class ReverseArray {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }int j=n-1;
        int temp;
        for (int i = 0; i < j; i++) {
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
