import java.util.Scanner;

public class Concatenate {



    public static void main(String[] arg)
{
    System.out.println("Enter the first text: ");

    Scanner sc = new Scanner(System.in);
    String text1= sc.nextLine();
    System.out.println("Enter the second text: ");
    String text2 = sc.nextLine();

    System.out.println("The new text is " + text1.concat(" " +text2) );
}

}
