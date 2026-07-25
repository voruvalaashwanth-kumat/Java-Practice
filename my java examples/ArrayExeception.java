import java.util.*;
class ArrayExeception{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the arry elements");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        
        }
        System.out.println("enter the index of the array element you want to display");
        int index=sc.nextInt();
        try{
            System.out.println("the array element at index "+index+"is"+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds!"+e);
            
        }
        }
    }






