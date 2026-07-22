 import java.util.*;
class Main()
 {
    public static void main(String[]args)
    {
         Scanner sc=new Scanner(System.in);
         int even=0;
         int odd=0;
         int greater50=0;
         System.out.println("enetr the only 10");
            for(int i=0;i<10;i++)
            {
                 int n=sc.nextInt();
                 if(n%2==0)
                 {
                    even++;
                 }
                 else
                 {
                    odd++;
                 }
                    if(n>50)
                    {
                        greater50++;
                    }}
                    System.out.println("even numebrs are:"+even);
                    System.out.println("odd numbers are :"+odd);
                    System.out.println("greater than 50 are "+greater50);
    }
}
