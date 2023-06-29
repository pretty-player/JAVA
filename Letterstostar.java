import java.util.Scanner;
class Letterstostar{
public static void main(String arg[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the String :");
String str=scan.nextLine();
char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
char strTOarr[]=str.toCharArray();
for(int i=0;i<strTOarr.length;i++){

    for(int j=0;j<ch.length;j++){

        if(strTOarr[i]==ch[j]){

            strTOarr[i]='*';
          }
       }
}
System.out.println(strTOarr);
}
}
