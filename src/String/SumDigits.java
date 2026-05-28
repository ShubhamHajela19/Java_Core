package Loop;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the digits: ");
        int d = sc.nextInt();

        int sum = 0;
        while(d != 0){
            int digit = d % 10;
            sum += digit;
            d = d/10;
        }
        System.out.println("Sum of Digits: " + sum);
        sc.close();
    }
}
