import java.awt.*;
class TestExample

{
public  static void main(String[]args)
{
Frame frame= new Frame("TEST FEILD EXAMPLE");
TextField t1=new TextField("enter your name");
TextField t2=new TextField("enter your age");


frame.add(t1);
frame.add(t2);


t1.setBounds(30,100,200,20);
t2.setBounds(30,140,200,20);

frame.setSize(400,400);
frame.setLayout(null);
frame.validate();
frame.setVisible(true);

}
}
