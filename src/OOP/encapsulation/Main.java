package OOP.encapsulation;
import java.util.Scanner;
class Student{
    private String name;
    private int marks;

    public void setName(String n){
        name = n;
    }
    public void setMarks(int m){
        if(m >= 0 && m <= 100){
            marks = m;
        }else{
            System.out.println("Invalid marks");
        }
    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.print("Enter the marks of the student: ");
        int marks = sc.nextInt();

        s1.setName(name);
        s1.setMarks(marks);

        System.out.println("\nStudent Details");
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
