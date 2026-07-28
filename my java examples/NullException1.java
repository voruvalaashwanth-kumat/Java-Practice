import java.util.*;

class NullException1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name = null;

        try
        {
            System.out.println(name.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("String is null.");
        }

        System.out.println("Program completed.");
    }
}