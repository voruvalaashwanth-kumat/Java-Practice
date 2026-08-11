import java.util.*;

class PrintStackExample
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

            System.out.println("Answer = " + (a / b));
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong!");

            e.printStackTrace();
        }
    }
}