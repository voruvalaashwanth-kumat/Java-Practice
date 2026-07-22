class Rev
{
    public static void main(String []args)
    {
        int arry[]={20,30,40,60};
        System.out.println("the arry before rev");
        for(int i=0;i<arry.length;i++)
      {
        System.out.println(arry[i]);
            
        }
        System.out.println("the arry after revsal");
        for(int j=arry.length-1;j>=0;j--)
        {
            System.out.println(arry[j]);
        }
    }
}