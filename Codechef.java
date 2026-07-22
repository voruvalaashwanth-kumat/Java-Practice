import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
         int arr[]={10,2,4,5,6,7,8,8,8};
         int maxcount=0;
         int mostf=arr[0];

         for(int i=0; i<arr.length; i++)
         {
             int count = 0;  // Move count reset here
             
             if(arr[i] % 2 == 0)  // Check for even numbers
             {
                 for(int j=0; j<arr.length; j++)
                 {
                     if(arr[i] == arr[j])
                     {
                         count++;
                     }
                 }
                 
                 if(count > maxcount)  
                 {
                     maxcount = count;
                     mostf = arr[i];
                 }
             }
         }

         if (maxcount > 0)
         {
             System.out.println("Most frequent even number: " + mostf);
             System.out.println("Frequency: " + maxcount);
         }
         else
         {
             System.out.println("There is no even number");
         }
    }
}
