package Arrays;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int array[]=new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = arr[i];
        }

        int j=n-1;
        int temp;
        for (int i = 0; i < j; i++) {
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==array[i]){
                count++;
            }
        }if(count==n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
