import java.util.*;

class GetMessageExampl{
    public static void main(String[]args)
    {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int a=sc.nextInt();
            System.out.println("enter a number");
            int b=sc.nextInt();
            System.out.println("answer"+(a/b));

        }
        catch(Exception e)
        {
             System.out.println("somthing went wrong");
             System.out.println("Exception: " + e. getClass().getName());
             System.out.println(e.getMessage());
        }
    }
}