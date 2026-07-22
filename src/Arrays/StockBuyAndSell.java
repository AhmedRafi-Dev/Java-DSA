package Arrays;

import java.util.Scanner;

public class StockBuyAndSell {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the element of array: ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }int minprice=arr[0];
        int maxprofit=0;
        int profit=0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]<minprice){
                
                minprice=arr[i];
            } else if (arr[i]>minprice) {
                profit=arr[i]-minprice;
                if (profit>maxprofit){
                    maxprofit=profit;
                }
            }

        }
        System.out.println(maxprofit);
        }
    }


