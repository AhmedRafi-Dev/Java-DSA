package Arrays;

import java.util.Scanner;

public class FrequencyOfDigits {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        int count=0;
        int arr[ ]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("The Frequency of the target digit is : " +count);
    }
}
