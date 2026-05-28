package String;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String palindrome = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            palindrome = palindrome + str.charAt(i);
        }
        if(str.equals(palindrome)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
