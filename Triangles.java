//Multiple triangle from pretty player
import java.util.Scanner;
class Rect{

public static void rect(int a){
int mid=0+a/2;
for(int i=0;i<=a;i++){
  for(int j=0;j<=a;j++){
if(i==a || j==a || j==mid || i==mid || i==0 || j==0 || i==j ||  i+j==a){
  System.out.print("*");
 }
  else{
  System.out.print(" ");
   }
  }
 System.out.println();
  }
 }
public static void main(String arg[]){
Scanner scan=new Scanner(System.in);
System.out.println("Length of the react :");
int value=scan.nextInt();
scan.close();
rect(value);
}

}
