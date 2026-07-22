import java.util.*;
class ChartgptNaHero
{
    void GPT()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("what you want to repaet");
        String sent=sc.nextLine();
        System.out.println("enter how many times i want to repeat");
        int count=sc.nextInt();
        System.out.println("your sentence is ");
        for(int i=1;i<=count;i++)
        {
            System.out.println(sent);
        }
    }
}
class Parrot
{
    public static void main(String[] args) {
        ChartgptNaHero gpt=new ChartgptNaHero();
        gpt.GPT();

        
    }
}