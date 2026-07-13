package Arrays;

import java.util.Scanner;

public class CountEvenOdd {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
int count1=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0){
                count++;
            } else if (arr[i]%2==1) {
                count1++;
            }
        }
        System.out.println("Even number in array is : "+count);
        System.out.println("Odd number in array is : "+count1);
    }
}
