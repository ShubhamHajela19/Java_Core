package Conditions;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(a < 0){
            a = -a;
        }
        System.out.println("Absolute value: " + a);
        sc.close();
    }
}
