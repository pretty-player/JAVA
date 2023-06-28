//left triangle
class Left{
public static void main(String arg[]){

int row=Integer.parseInt(arg[0]);

 for(int i=1;i<row;i++){

    for(int j=0;j<=row-i;j++){
       System.out.print(" ");
          }
     for(int x=0;x<i;x++){
        System.out.print("*");
          }
  System.out.println();
  }
 }
}
