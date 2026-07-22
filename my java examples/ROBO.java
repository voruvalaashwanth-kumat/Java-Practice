import java.util.*;
 class ROBO
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("iam robo iam robo plase respondme enter how many horus doo you sleep");
            int n=sc.nextInt();
            if(n<0)
            {
                System.out.println("🚫 Invalid input. Sleep can't be negative!");
                break;
            }
            if(n<=3)
            {
                System.out.println("😡 You're a zombie! Go sleep now!");
            }
            else if(n>3&&n<=6)
            {
                System.out.println("😑 Half-charged... Need more rest!");

            }
            else if(n>6&&n<=9)
            {
                System.out.println("😄 Fresh and fabulous!");
            }
            else {
                System.out.println("🐌 Overslept! You might turn into a sloth!");
            }
            }while(true);
        }
    }
 