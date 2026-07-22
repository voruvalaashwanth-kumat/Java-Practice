class Avgarr
{
public static void main(String args[])
{
 int arr[]={10,20,30,40,50};
int sum=0;
for(int i=0;i<arr.length;i++)
{
  sum+=arr[i];
 }
System.out.println("first total sum of the array is "+sum);
double avg=sum/arr.length;
System.out.println("the average of the array is "+avg);
}
}
