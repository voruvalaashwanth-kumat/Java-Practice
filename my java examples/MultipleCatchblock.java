// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*Problem: Multiple Exceptions Handle Cheyyali

Oka program lo user nunchi 2 integers teesuko.

First number read cheyyali.
Second number read cheyyali.
First number ni second number tho divide cheyyali.
User second number 0 isthe ArithmeticException handle cheyyali.
User integer badhulu text isthe InputMismatchException handle cheyyali.
Rendu exceptions ki separate catch blocks undali.
Exception vachina tarvatha suitable message print cheyyali.
Exception rakapothe answer print cheyyali.
Finally "Program completed" print cheyyali.*/
import java.util.*;
class MultipleCatchblock{
    public static void main(String[] args) {
        try{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the onter number");
            int b=sc.nextInt();
           int c=a/b;
            System.out.println("c value is"+c);
            
            }
        catch(ArithmeticException e)
            {
                System.out.println("zero by divtion exception");
                
            }
        catch(InputMismatchException e)
            {
                System.out.println("input mis match excption");
            }
    }
}