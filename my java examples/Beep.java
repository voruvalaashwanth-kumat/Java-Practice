
import java.util.*;

class Opps
{
    void robo()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("whata sentence should repete my dear ashu");
        String s=sc.nextLine();
        System.out.println("how many time should i reapeat");
        int count=sc.nextInt();
        System.out.println("ok iam going to repeat ");


     for(int i=0;i<count;i++)
     {
        System.out.println(s);
     }   
        }



}
class Beep
{
    public static void main(String[]args)
    {
        Opps obj=new Opps();
        obj.robo();
    }
}