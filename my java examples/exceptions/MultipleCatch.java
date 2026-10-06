/*Java lo oka try block lo different types
 of exceptions occur avvachu. Alanti situation 
 lo manam oka try block ki multiple catch blocks
  use cheyyachu. Prathi catch block oka particular
type of exception ni handle chestundi.
try
{
    // risky code
}
catch(ArithmeticException e)
{
    System.out.println("Arithmetic problem");
}
catch(InputMismatchException e)
{
    System.out.println("Wrong input");
}
    oder impoetet multipe catch lo

    Multiple Catch — Order Enduku Important?

Suppose manam ila rasam:

try
{
    // code
}
catch(Exception e)
{
    System.out.println("Exception");
}
catch(ArithmeticException e)
{
    System.out.println("Arithmetic Exception");
}

❌ Idi correct kaadu.

Enduku?

ArithmeticException anedi Exception kindha untundi. 
Multiple Catch Blocks – Why is the Order Important?

In Java, we can use more than one catch block with a
 single try block. This is called multiple catch blocks.
  Multiple catch blocks are useful when different types
   of exceptions can occur in the same part of 
   a program. Each catch block can handle a different
type of exception. For example, a program may 
produce ArithmeticException when we divide a number
by zero and it may produce InputMismatchException
 when the user enters text instead of an integer. 
  Java provides an exception hierarchy where many
  specific exception classes are related to the 
general Exception class. For example,  
ArithmeticException and InputMismatchException
are subclasses of Exception. Because of this 
       relationship, the order of the catch blocks is 
       very important. Java checks the catch blocks 
       from top to bottom when an exception occurs. 
       It first checks whether the first catch block can
handle the exception. If it can handle the exception, 
Java executes that catch block and does not check the 
remaining catch blocks. Therefore, if we write the 
general Exception catch block first, it can catch many 
specific exceptions also. For example, if
 ArithmeticException occurs and we write
  catch(Exception e) first, the general catch block can
   handle the ArithmeticException. Because the exception
    is already handled by the first catch block, the 
    later catch(ArithmeticException e) block can never
     be reached. Java therefore gives a compile-time 
     error for the unreachable catch block. To avoid 
     this problem, we must always write the more 
     specific exception catch blocks first and the 
     general exception catch block later. For example,
      catch(ArithmeticException e) should come before 
      catch(Exception e). Similarly, other specific 
      exception types should be written before their
       parent or general exception type. This rule can
        be remembered as specific exception first and 
        general exception last. In simple words, the 
        child exception should come before the parent
         exception because the parent exception can
 already handle the child exception. Therefore, when 
 using multiple catch blocks, we should arrange them 
 from more specific exceptions to more general
  exceptions. This makes the program correct and allows
every specific catch block to get a chance to handle its
 own type of exception.*/
 import java.util.*;

class MultipleCatch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            int c = a / b;

            System.out.println("Answer = " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter numbers only");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println("Program completed");
    }
}

