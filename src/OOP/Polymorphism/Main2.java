package OOP.Polymorphism;

import java.util.Scanner;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat makes a sound");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter animal type: ");
        String type = sc.next();

        Animal a;
        if(type.equalsIgnoreCase("dog")){
            a = new Dog();
        }else if(type.equalsIgnoreCase("cat")){
            a = new Cat();
        }else {
            a = new Animal();
        }
        a.sound();
    }
}
