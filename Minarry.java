class Minarry
{
public static void main(String[]args)
{
  int arr[]={10,20,5,66,77};
System.out.println("your array  is ");
for(int i=0; i<arr.length; i++)
{
   System.out.println(arr[i]);
}
int min =arr[0];
for (int i=0;i<arr.length; i++)
{
if(arr[i]<min)
{
 min=arr[i];
}
}
System.out.println("the minimum value in the arry is "+min);
}
}