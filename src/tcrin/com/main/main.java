package tcrin.com.main;

import tcrin.com.fraction.Fraction;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter the number of element:");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Enter a positive integer number!!");
            }
        } while (n < 0);
        Fraction fraction = new Fraction();
        fraction.createFraction(n);
        fraction.displayFraction();
    }
}
