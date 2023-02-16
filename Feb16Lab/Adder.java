package Feb16Lab;

import java.util.Scanner;

public class Adder implements Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        Adder add = new Adder();
        add.add(a, b);
    }
}
