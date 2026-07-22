
class Sumof
{
    
     public static void main(String[]args)
    { 
        int sum=0;
        int a[]={10,20,30,40,50};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);

        }
        System.out.println("the sum of total aray is ");
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}