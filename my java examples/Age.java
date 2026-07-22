import java.awt.desktop.SystemSleepEvent;
import java.util.*;
class Age
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println(" boy boy cute boy or girl girl cute girl please enter your age");
            int age=sc.nextInt();
            if(age=0)
            {
                System.out.println("age not be in negitive ");
                break;
            }
            if(age>=0&&age<5)
            {
                System.out.println("your are cute little baby");

            }
              else if(age>=5&&age<=12)
              {
                System.out.println("School kid plase do home work");

              }
              else if(age>=13&&age<=19)
              {
             System.out.println("teenager ");

              }
              else if(age>20&&age<=40)
              {
                System.out.println("working adult");

              }
              else 
              {

              
                System.out.println("the grand parant");

              } 
              
              }while(true);
              }
                
            }
        
    
