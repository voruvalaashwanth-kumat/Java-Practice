
import java.util.*;

class FoodDetector
{
    public static void main(String[]args)
    {
        Scanner dc=new Scanner(System.in);
        System.out.println("what food did eat today");
        String food=dc.nextLine();
        if(food.equalsIgnoreCase("fiza"))
        {
            System.out.println("🍕 Pizza detected! Installing happiness module...");
        }
        else if(food.equalsIgnoreCase("rice"))
        {
            System.out.println("the super super rice");
        }
        else if(food.equalsIgnoreCase("idly"))
        {
            System.out.println(" bajjunta nidhra vasthundhi");
        }
        else 
             {
               System.out.println("🔍 Searching food database... Unknown item");
        
        }
        

    }
}
