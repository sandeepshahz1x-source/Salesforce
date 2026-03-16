package Java;
import java.util.Scanner;


public class practice1{
    public static void main(String[] args){

        int sum,a,b;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum of a and b is:" + sum);
    }
}
