import java.util.Arrays;
import java.util.Scanner;
public class anagram
{
    public static void main(String[]args)
    {
        Scanner san= new Scanner(System.in);
        System.out.println("enter a first sting:");
        String str1=san.nextLine().toLowerCase();
        System.out.println("enter a second string:");
        String str2=san.nextLine().toLowerCase();
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            System.out.println("anagram");
        }
        else{
            System.out.println("not a anagram");
        }
    }
}