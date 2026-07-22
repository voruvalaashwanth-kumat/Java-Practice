import java.lang.*;
class Arsum
{
public static void main(String args  [])
{
 int arr[]={20,30,40,50};
  int sum=0;
  try{
for(int i=0;i<arr.length;i++)
{
   sum +=arr[i];
 
}
System.out.println("sum of the elements are "+sum);
}
catch(ArrayIndexOutOfBoundsException e)
{
}
}
} 