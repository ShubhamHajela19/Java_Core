package OOP.inheritence;
import java.util.Scanner;
class Animal{
    String color;
    void eat(){
        System.out.println("Animal is eating");
    }
}
class dog extends Animal{
    String breed;
    void bark(){
        System.out.println("Animal is barking");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dog d1 = new dog();
        System.out.print("Enter Dog Color: ");
        d1.color = sc.nextLine();

        System.out.print("Enter Dog Breed: ");
        d1.breed = sc.nextLine();

        System.out.println("\nDog Details");
        System.out.println("Color: " + d1.color);
        System.out.println("Breed: " + d1.breed);

        d1.eat();
        d1.bark();
    }
}
