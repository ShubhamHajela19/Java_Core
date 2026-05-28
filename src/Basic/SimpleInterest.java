package Basic;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter the Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter the time: ");
        double t = sc.nextDouble();

        double si = (p*r*t)/100;

        System.out.println("Simple interest = " + si);
        sc.close();
    }
}
