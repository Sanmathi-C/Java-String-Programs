import java.util.Scanner;
public class countwords{
    public static void main(String[]args){
        Scanner san=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=san.nextLine();
        str=str.trim();
        if(str.isEmpty())
        {
            System.out.println("no of words=0");

        }
        else{
            String[] words=str.split("\\s+");
            System.out.println("no of words="+words.length);
        }
    }
}