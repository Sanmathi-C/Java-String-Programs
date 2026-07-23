import java.util.Scanner;
public class countvowel{
    public static void main(String[]args){
        Scanner san=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=san.nextLine();
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
           char ch=str.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
            count ++;
           }
        }
        System.out.println("number of vowels="+count);
    }
}