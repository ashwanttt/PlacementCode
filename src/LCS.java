import java.util.*;
public class LCS {
    public static int  Sequence(String str1, String str2)
    {
        int[][] arr = new int[str1.length()+1][str2.length()+1];
        int i,j;
        for(i = 0; i < str1.length()+1; i++)
        {
            for(j = 0; j < str2.length()+1; j++)
            {
                if(i==0||j==0)
                {
                    arr[i][j] = 0;
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    arr[i][j] = arr[i-1][j-1] + 1;
                }
                else
                {
                    arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
                }
            }
        }
        return arr[str1.length()][str2.length()];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter The First String");
        str1 = sc.nextLine();
        System.out.println("Enter The Second String");
        str2 = sc.nextLine();
        
        System.out.println("The value of the longest subsequence is :" + Sequence(str1, str2));
        
    }
    
}
