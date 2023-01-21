class Square
{
  public Square(int a)
    {
        for(int i=1;i<a+1;i++)
        {
            for(int j=1;j<a+1;j++)
            {
                //define the square places i=1 , i=last_number and j=1,j=last_number
                if(i==1 || j==1 || i==a || j==a)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
  public static void main(String[] args)
  {
    new Square(9);
  }
}
