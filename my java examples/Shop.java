
import java.util.*;
class Shop
{
    public static void main(String[]args)
    {
     Scanner sc=new Scanner(System.in);
      int total=0;
     do {  
           
         
           System.out.println("enter item name");

           String item=sc.nextLine();
           if(item.equalsIgnoreCase("done"))
           {
             System.out.println("the total bill is "+total);
             if ( total <=100)
             {
                System.out.println("super shoping under bujet");
             }
             else{
                System.out.println("you spent lot");
             }
                  break; 
           }
           System.out.println("enter the ammout");
           int n=sc.nextInt();
           sc.nextLine();
           
            total=total+n;
           
     }while(true);
    }
}

    