import java.util.*;
class Telugutitans
{
void kabbadi()
{
Scanner sc=new Scanner(System.in);

System.out.println("enter which song i should singh");

String song=sc.nextLine();
System.out.println("enter how manay times should i singh");
int count=sc.nextInt();
System.out.println("OK IAM GOING TO SING");
for(int i=0;i<count;i++)
{
System.out.print(song);
}
}
}
class Song
{
public static void main(String[]args)
{
Telugutitans obj= new Telugutitans();
obj.kabbadi();
}
}