//Write a Java program that takes two numbers as input and prints their sum.
import java.util.Scanner;
class SumExample
{
 void display()
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the first number");
 int num1=sc.nextInt();
System.out.println("your first number is"+num1);
System.out.println("enter the second number");
int num2=sc.nextInt();
 System.out.println("your second number is "+num2);
int total=num1+num2;
System.out.println("the sum is "+total);
}
}
class Main{
public static void main(String[]args)
{
SumExample obj=new SumExample();
obj.display();
}
}