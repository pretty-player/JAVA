class X
{
  public X(int a)
    {
        for(int i=1;i<a;i++)
        {
            for(int j=1;j<a;j++)
            {
                //i==j left to right , i+j==a right to left
                if(i==j || i+j==a)
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
  public static void main(String[] arg)
  {
    new X(9);
  }
}
