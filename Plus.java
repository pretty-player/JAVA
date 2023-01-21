class Plus
{
    // Constructor 
    public Plus(int a)
    {
        if(a%2==0)
          {
             a=a+1;
           }
            //find midle number
            int mid=1+a/2;

        for(int x=1;x<a;x++){
            for(int y=1;y<a;y++)
            {
                //Target middle numbers
                if(y==mid || x==mid)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
       new Plus(9);
    }

}
