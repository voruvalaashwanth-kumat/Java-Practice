import java.util.*;
class InputMisMatchExceptionExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter marks");
            int marks=sc.nextInt();
            System.out.println("you entered: "+marks);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. please enter marks in integer.");
            System.out.println("error:"+e);
        }
    }
}