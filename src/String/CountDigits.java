package Loop;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits: ");
        int d = sc.nextInt();
         int count = 0;
         while(d != 0){
             d = d/10;
             count ++;
         }
        System.out.println("No.of digits are: " + count);
         sc.close();
    }
}
