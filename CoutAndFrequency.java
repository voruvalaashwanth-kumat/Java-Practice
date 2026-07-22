class CoutAndFrequency
{
    public static void main(String[]args)
    {
    int arr[]={1,3,4,4,4,4,4,6,6,6,6,7,7,7,7,9,9,9,9,6,4,4,4};
    int  maxcount=0;
    int mostf=arr[0];
    for(int i=0;i<arr.length;i++)
    {
       int count=0;
        for(int j=0;j<arr.length;j++)
        {
          if(arr[i]==arr[j])
          {
             count++;
             
          }
          
        }
        if(count>maxcount)
        {
         maxcount=count;
         mostf=arr[i];
        }
    }
    System.out.println(mostf);
    System.out.println(maxcount);
        
    }
}