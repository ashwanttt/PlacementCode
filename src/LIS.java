import java.util.*;

public class LIS
{
   public static int subsequence(int[] arr)
   {
        int[] lis = new int[arr.length];
        int i,j, max=0;
        for(i = 0; i < arr.length; i++)
        {
            lis[i] = 1;
        }
        for(i = 1; i < arr.length; i++)
        {
            for(j = 0; j < i; j++)
            {
                if(arr[i]>arr[j])
                {
                    lis[i] = Math.max(lis[j]+1,lis[i]);
                }
                
            }
            if(lis[i]>max)
            {
                max = lis[i];
            }
        }
        return max;

   }
   public static void main (String args[])
   {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Enter the length of the Array");
        length = sc.nextInt();
        int arr[] = new int[length];
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter the "+ (i+1)+" element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("The longest increasing sequence is " + subsequence(arr));
        
   }     
}
