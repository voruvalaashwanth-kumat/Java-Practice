import java.util.*;
class Food
{
    public static void main(String[]args)
    {
        int total=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("enter your food i will tell you calories");
            String food=sc.nextLine();
            
            if(food.equalsIgnoreCase("done"))
            {
                System.out.println("your total caloreis is"+total);
                if(total<500)
                {
                    System.out.println("good boy you taking helthy food");
                }
                else{
                    System.out.println("you are taking junk food");
                }
                break;

            }
            if(food.equalsIgnoreCase("rice"));
            {
                int n=200;
                System.out.pritnln("the rice clories are"+n);
                total=total+n;
                
            }
            if(food.equalsIgnoreCase(""))
            
        }
    }
}