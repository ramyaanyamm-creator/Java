import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int start=0; start<n;start++)
        {
            int sum=0;
            for(int end=start;end<n;end++)
            {
                sum+=arr[end];
                if(sum<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
