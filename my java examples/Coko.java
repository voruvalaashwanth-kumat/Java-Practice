import java.util.*;

class Robo
{
    void chitti()
    {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("enter the positive number");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println(" machine close");
            break ;
        }
        if(n%4==0&&n%6==0)
        {
            System.out.println("pepsi and coke combo");

        }
        else if(n%4==0)
        {
            System.out.println("pepsi");

        }else if(n%6==0)
        {
            System.out.println("coke");
        }
        else {
            System.out.println("no cool drink");
        }

        }while(true);
    }
}
class Coko
{
    public static void main(String args[])
    {
        Robo obj=new Robo();
        obj.chitti();
    }
}