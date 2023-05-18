package lab1a;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int num1;

        System.out.println("Enter an integer");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(" Your number is Even");
        }
        if (num1 % 2 != 0) {
            System.out.println(" Your number is Odd");
        }

    }
}
