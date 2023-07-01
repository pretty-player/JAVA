
/*

Reverse the string 

input : Education

output : cudEnoita

find the middle character and split two part of the given string


*/

import java.util.Scanner;
class Complexreverse{

public static String reverse(String msg){

    char strarray[]=msg.toCharArray();
    String append=new String();
    int i=msg.length()-1;
    for(;i>=0;--i){
       append+=strarray[i];
     }
      return append;
}

public static void main(String arg[]){

    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the string :");
    String word=scan.nextLine();
    scan.close();

    int mid=0+word.length()/2;

    String foff=word.substring(0,mid);
    String soff=word.substring(mid,word.length());
    System.out.println(reverse(foff)+""+reverse(soff));
    }
}
