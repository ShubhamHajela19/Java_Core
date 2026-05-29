package OOP.Polymorphism;
import java.util.Scanner;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    int add( int a, int b, int c){
        return a+b+c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c1 = new Calculator();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("\nSum of 2 numbers: " + c1.add(a,b));
        System.out.println("\nSum of 3 numbers: " + c1.add(a,b,c));
    }
}
