import java.util.*;
//Hackker rank
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr= new int[n];


        int count = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

        }

        int key = arr[k-1];

        for(int i = 0; i < n; i++)
        {
            if(arr[i] >= key && arr[i] > 0)
            {
                count++;
            }

        }

        System.out.println(count-1);



    }
}