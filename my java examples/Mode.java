import java.util.*;
class Mode{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("enter the number between 1to10");
        int n=sc.nextInt();
        if(n>10)
        {

            System.out.println( "🤖 I don't understand your human feelings.");
            break;
        }
        if(n==1||n==2)
        {
            System.out.println( "😭 I need chocolate... now!");
        }
        else if(n==3||n==4)
        {
            System.out.println("😒 Meh. Everything's boring.");
        }
        else if(n==5||n==6)
        {
            System.out.println("🙂 Okay okay types...");
        }
        else if(n==7||n==8)
        {
            System.out.println("iam feeling good");
        }
        else if(n==9||n==10)
        {
            System.out.println("😎 Superhero mode ON!");
        }
    }while(true);
    }
}