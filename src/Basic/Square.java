package Basic;
import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n*n;
        int cube = n*n*n;

        System.out.println("Square of the number = " + square);
        System.out.println("Cube of the number = " + cube);

        sc.close();
    }
}
