import java.util.*;

class DyanamicException1
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
            System.out.println("Exception: " + e.getClass().getSimpleName());
        }
    }
}