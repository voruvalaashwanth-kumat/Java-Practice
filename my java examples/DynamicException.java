































































































/*Dynamic Exception Handling in Java
1. Introduction

Java programs sometimes face different problems while they are running. These problems may happen because of user input, calculations, arrays, objects, files, or other operations. When a problem occurs during program execution, Java creates an exception. In many simple programs, we already know what type of exception may occur. For example, while dividing two numbers, we may know that ArithmeticException can occur. In that case, we can directly use catch(ArithmeticException e). But in some programs, we may not know which exception will occur before the program runs. The actual exception may depend on the input given by the user. It may also depend on the operation performed by the program. For example, one user may enter correct numbers, another user may enter zero, and another user may enter text. Because of these different inputs, different exceptions can occur. In such situations, it is useful to handle exceptions in a general way. Java allows us to use the general Exception class for this purpose. We can write catch(Exception e) to catch the exception. After catching the exception, we can find what type of exception actually occurred. Java provides methods such as getClass() and getSimpleName() for getting information about the exception. This allows us to identify the exception during runtime. This process is commonly called dynamic exception handling or dynamic exception identification. It is useful when we want to handle different possible exceptions without knowing the exact exception before execution. It is also useful during testing and debugging because it helps us understand what went wrong in the program.

2. What is Dynamic Exception Handling?

Dynamic exception handling is a way of handling an exception when we do not know the exact type of exception before the program runs. Instead of writing only one specific exception type, we can use the general Exception class. The general Exception class can catch many common exceptions. When an exception occurs, the exception object is stored in a reference variable such as e. We can use this object to get information about the exception. The actual exception type is known when the program is running. For example, suppose a program takes two numbers from the user and divides them. If the user enters 10 and 2, no exception occurs. If the user enters 10 and 0, an ArithmeticException occurs. If the user enters 10 and Ashu, an InputMismatchException may occur. Before running the program, we cannot know exactly what the user will enter. Therefore, we may not know which exception will occur. By using catch(Exception e), we can catch the exception in a general way. After catching it, we can use e.getClass().getSimpleName() to identify its actual name. This gives us the exception name during runtime. Dynamic exception handling therefore helps us handle unknown or different possible exceptions in a common way. It does not mean that Java automatically solves every problem. It means that Java can catch the problem and give us information about the actual exception. We can then decide how to handle the problem properly.*/
import java.util.*;

class DynamicException
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter a number:");
            int a = sc.nextInt();

            System.out.println("Enter another number:");
            int b = sc.nextInt();

            System.out.println("Answer = " + (a / b));
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong!");

            System.out.println("Exception Class: " + e.getClass());

            System.out.println("Exception Name: " 
                               + e.getClass().getSimpleName());

            System.out.println("Exception Message: " 
                               + e.getMessage());

            System.out.println("Complete Exception Details:");
            e.printStackTrace();
        }

        System.out.println("Program completed.");
    }
}






































