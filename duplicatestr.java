import java.util.Scanner;
public class duplicatestr{
    public static void main(String[]args)
    {
        Scanner san=new Scanner(System.in);
        System.out.println("enter a sting:");
        String str=san.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}