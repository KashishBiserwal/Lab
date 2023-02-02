package Feb2Lab;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int num4 = sc.nextInt();
        System.out.print("Enter 5th number: ");
        int num5 = sc.nextInt();
        System.out.println("The average of all numbers is: " + (num1+num2+num3+num4+num5)/5);
    }
}
