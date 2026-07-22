import java.util.*;
class Urmila
{
 public static void main(String[]args)
 {
Scanner sc=new Scanner(System.in);
System.out.println(" urri akka oka integer number kottu ");
int n=sc.nextInt();
System.out.println("akka nuvvu type chesina first number "+n);
System.out.println("akka please type onther number ");
int s=sc.nextInt();
System.out.println("akka nuvvu type chesina second number "+s);
System.out.println("akka nenu ippudu nuvu type cheina number midha addition perfome chesthuna");
System.out.println("The addition between"+n+"and"+s+"is:"+"sum="+(n+s));
System.out.println("akka plase naku rating ivvu out 1,2,3,4,5 :plase give rating");
int a=sc.nextInt();
if(a<=5)
{
    System.out.println("thank you akka naku"+a+"rating ichi nadhuku");

}
else{
    System.out.println("akka nuvu type cheina rating"+a+"dintlo ledhu");
}

 }
}
