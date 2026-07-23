import java.util.Scanner;
public class removeduplicate{
    public static void main(String[]args)
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=san.nextLine();
        String result="'";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result += ch;
            }

        }
        System.out.println("duplicate string is:"+result);
    }
}