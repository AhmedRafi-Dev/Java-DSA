package Arrays;

import java.util.Scanner;

public class MoveZeroesToBeginning {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }int j=n-1;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j--;
            }
        }
        for (int i = j; i >=0 ; i--) {
            arr[i]=0;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
