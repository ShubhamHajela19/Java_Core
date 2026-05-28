package Conditions;
import java.util.Scanner;

public class VoteingEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        if(a >= 18){
            System.out.println("Eligible for voting!!");
        }else{
            System.out.println("Not eligible for voting");
        }
        sc.close();
    }
}
