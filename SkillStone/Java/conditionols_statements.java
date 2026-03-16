package Java;

import java.util.Scanner;

public class conditionols_statements {

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check if you are eligible to drive: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive yet. Please wait until you turn 18.");
        }

    }
}
