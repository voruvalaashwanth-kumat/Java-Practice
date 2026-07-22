
import java.util.*;
class Idly
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ente any natural numebr");
        int n=sc.nextInt();
        if(n%2==0&&n%7==0)
        {
            System.out.println("idly dosa prasal");

        }
        else if(n%2==0)
        {
            System.out.println("idly parsal");

        }
        else if(n%7==0)

        {
        System.out.println("dosa parsal");
        }
        else{
            System.out.println("no brakpast ");
        }
    }
}