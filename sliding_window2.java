package geeks.array;
import java.util.*;

class GFG {
    static int sliding_window2(int arr[], int n, int k){
        int curr_sum = 0;
        for (int i = 0; i < k; i++)
        curr_sum += arr[i];
        int max_sum = curr_sum;
        for (int i = k; i < n; i++) {
            curr_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, curr_sum);
            }
            return max_sum;
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of elements :");
            int n = sc.nextInt();

            System.out.println("enter the size of sliding :");
            int k = sc.nextInt();

            System.out.println("enter the array :");
            int arr [] = new int[n];
            
            for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            }
            System.out.println("maximum sum of subarray "+k+" is :"+sliding_window2(arr, n, k));
        }
    }

