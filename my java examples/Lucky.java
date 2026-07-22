
import java.util.*;
class Lucky
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter your lucky number");
            int n=sc.nextInt();
            if(n<0)
            {
                System.out.println("the luky number cant be negitive");
                break;
            }
             if(n>=1&&n<=10)
             {
                System.out.println("🎉 Lucky draw winner! Jackpot unlocked");
             }
             else{
                System.out.println("😢 Sorry! Better luck next time. Try again");
             }
        }while(true);
    }
}