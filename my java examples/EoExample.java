//Write a Java program that checks whether a number is even or odd.
import java.util.*;
class EoExample
{
public static void main(String[]args)
{
  Scanner dc=new Scanner( System.in);
    System.out.println("enter the numebr");
   int num=dc.nextInt();
if(num%2==0)
{
System.out.println("Given number"+num+"is Even number:");
}
else
{
System.out.println("Given number"+num+"is Odd Number:");
}
}
}