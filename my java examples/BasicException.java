import java.util.*;
class BasicException{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number");
        int a=sc.nextInt();
        System.out.println("enter a second number");
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println("the result is"+c);
        } catch(ArithmeticException e){
            System.out.println("you cannot divide a number by zero"+e);
            
        }

        }
    }

