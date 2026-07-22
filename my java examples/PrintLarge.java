//Write a Java program that takes two numbers as input and prints the larger one.
import java.util.*;
class PrintLarge
{
void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
int num=sc.nextInt();
System.out.println("the first number is:"+num);
System.out.println("enter second number ");
int num2=sc.nextInt();
System.out.println("the second number is:"+num2);
if(num>num2)
{
System.out.println(" the  first number"+num +" is greater");
}
else
{
System.out.println("the second number"+num2+"is greater");
}
}
}
class Main
{
public static void main(String[]args)
{
  PrintLarge obj =new PrintLarge();;
obj.display();
}
}