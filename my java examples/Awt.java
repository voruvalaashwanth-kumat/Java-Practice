import java.awt.*;
class Awt
{
public static void main(String[]args)
{
Frame f=new Frame("iam frame");
Button b=new Button("click Here");
b.setBounds(300,200,30,30);
f.setSize(400,400);
f.add(b);
f.setVisible(true);
f.setLayout(null);
}
}