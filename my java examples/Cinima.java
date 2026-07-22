import java.util.*;
class Supper
{
  void robo()
  {
    Scanner sc=new Scanner(System.in);
     do{ 
        System.out.println("Enter postive number ");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("🎥 Show ended! See you next time!");
            break;
        }
        if(n%12==0&&n%14==0)
        {
            System.out.println("🎬 VIP Gold Ticket + Popcorn Combo 🍿🥤");
        }
        else if(n%12==0)
        {
          System.out.println("🎟️ Silver Ticket");
        }
        else if(n%14==0)
        {
            System.out.println("🍿 Free Popcorn");

        }
        else{
            System.out.println("⛔ No entry – Go home 😭");
        }
    } while (true);
  }
}
class Cinima
{
    public static void main(String[] args) {
        Supper obj=new Supper();
        obj.robo();
    }
}