package Basic;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celcius: ");
        double c = sc.nextDouble();

        double f = (9.0 / 5.0) * c + 32;

        System.out.print("Fahrenheit = " + f);

        sc.close();
    }
}
