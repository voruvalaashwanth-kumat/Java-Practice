import java.util.*;
class TastyPiza
{
    void display()
{
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("enter positive number");
    int n=sc.nextInt();
    if(n<0)
    {
        System.out.println(" Party Over! 🎉 ");
        break;
    }
    if(n%8==0&&n%10==0)
    {
        System.out.println("family fiza  🍕🍕");
    }
    else if(n%8==0)
    {
        System.out.println("Medium Pizza 🍕🍕");
    }
    else if(n%10==0)
    {
        System.out.println("Small Pizza 🍕");
    }
    else
    {
        System.out.println("No Pizza 😭");

    }
}while(true);
}
}
class Fiza
{
    public static void main(String args[])
    {
        TastyPiza obj=new TastyPiza();
        obj.display();
    }
}