class Ashwanth
{
    public static void main(String args[])
    {
        int arry[]={10,20,30,40,50};
        for(int i=0;i<arry.length;i++)
        {
            System.out.println(arry[i]);

        }
        System.out.println("array after the adding");
        arry[0]=60;
        for(int i=0;i<arry.length;i++)
        {
          System.out.println(arry[i]);
        }
        System.out.println("arry after sorting");
        for(int j=0;j<arry.length-1;j++)
        {
            for(int k=j+1;k<arry.length;k++)
            {
                if(arry[j]>arry[k])
                {
                    int t=arry[j];
                    arry[j]=arry[k];
                    arry[k]=t;                    
                }

            }
        }
        System.out.println("arry after sorting");
        for(int i=0;i<arry.length;i++)
        {
            System.out.println(arry[i]);
        }
        
    }
}