

import java.util.*;
class Mood
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("chinna nuvu ela feel ithunavo cheeppu nana niku chokalte ishta");
        String mode=sc.nextLine();
        if(mode.equalsIgnoreCase("happy"))
        {
            System.out.println("System detects high joy levels! Dance mode ON!");
            System.out.println("thisuko choklate");
        }
        else if(mode.equalsIgnoreCase("sad"))
        {
            System.out.println("😢 Deploying virtual hug protocol... Sending love...");
        }
        else if(mode.equalsIgnoreCase("angry"))
        {
            System.out.println("😡 Cooling fans activated. Deep breaths, please!");
        }
        else if(mode.equalsIgnoreCase("bored"))
      {
        System.out.println("🥱 Shall I tell you a joke? Or start fun mode?");
      }
      else if(mode.equalsIgnoreCase("tied"))
      {
        System.out.println("😴 Sleep mode activated. Shhh...");
      }
      else 
      {
        System.out.println("sorry iam cant genrante any feeling");
        System.out.println("cholclate cancel");
      }
    }
}