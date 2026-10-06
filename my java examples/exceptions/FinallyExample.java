
/*The finally block in Java is a block that is used to execute important code after the
 execution of the try and catch blocks. The finally block is mainly used when some code
  must be executed whether an exception occurs or not. If an exception occurs inside the
   try block, Java first moves to the suitable catch block and handles the exception. 
   After the catch block is completed, the finally block is normally executed. If no
    exception occurs inside the try block, the catch block is skipped and the finally 
    block is executed after the try block. Therefore, the finally block is useful when
     we want to perform an important task in both situations. For example, we may need to
      close a resource after using it, such as a file, database connection, or other 
      resource. The main purpose of the finally block is not to handle the exception;
       the catch block is used for handling the exception. The finally block is used for 
       code that should normally run after the exception-handling process. It can be used 
       with both try-catch and try-finally. A finally block can also be used when we do not
        want to write a catch block but still want some code to execute after the try block.
         In simple words, the finally block gives us a place to write important final code 
         that should normally execute after the main operation is completed. Thus,
          the finally block is an important part of Java exception handling and is mainly 
        //   used for cleanup and final operations.*/
        /*
Doubt:
If catch block executes, and we write normal code after the catch block,
will that code execute even without finally?

Answer:
Yes. If an exception occurs and the catch block handles it successfully,
the normal code written after the catch block can also execute.

Example:

catch(Exception e)
{
    System.out.println("Exception handled");
}

System.out.println("Program completed");

Here, "Program completed" will execute after the catch block.

So finally is not required just to execute the next normal statement.

Then why do we use finally?
finally is a special block mainly used for cleanup or final operations
that we want to perform after the try-catch process, whether an exception
occurs or not.

Therefore:
Normal code after catch -> can execute normally.
finally block -> special block for final/cleanup operations.
*/
import java.util.*;

class FinallyExample
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
        finally
        {
            System.out.println("Finally block executed");
        }

        System.out.println("Program completed");
    }
}
