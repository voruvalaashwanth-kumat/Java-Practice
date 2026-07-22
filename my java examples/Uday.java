import java.lang.*;
class My extends Thread
{
  void run()
  {
    System.out.println("uday kumar");

  }
}
class Uday
{
    public static void main(String[]args)
    {
        My obj= new My();
        Thread t=new Thread(obj);

        t.start();
    }
}