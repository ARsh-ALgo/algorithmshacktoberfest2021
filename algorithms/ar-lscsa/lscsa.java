import java.io.*;
import java.util.*;
// Java program to print largest contiguous array sum
import java.util.*;
 
class lscsa
{
    public static void main (String[] args)
    {
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }
    
    // Function to print largest contiguous array sum
    public static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
