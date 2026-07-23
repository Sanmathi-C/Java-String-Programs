import java.util.Scanner;
public class palindrome{


public static void main(String[]args){
    Scanner san=new Scanner(System.in);
    System.out.println("enter a string");
    String str=san.nextLine();
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
        rev+= str.charAt(i);
    }
    if(str.equals(rev)){
    System.out.println("is a palindrome");
    }
    else{
        System.out.println("not a plaindrome");
    }

}
}