package lab1a;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);

        System.out.println("input the first integer");
        num1 = input.nextInt();

        System.out.println("input the second integer");
        num2 = input.nextInt();

        System.out.println("input the third integer");
        num3 = input.nextInt();

        System.out.println("for the numbers " + num1 + " " + num2 + " and " + num3);

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest is " + num1);
        }
        ;
        if (num2 > num1 && num2 > num3) {
            System.out.println("Largest is " + num2);
        }
        ;
        if (num3 > num1 && num3 > num2) {
            System.out.println("Largest is " + num3);
        }
        ;

        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest is " + num1);
        }
        ;
        if (num2 < num1 && num2 < num3) {
            System.out.println("Smallest is " + num2);
        }
        ;
        if (num3 < num1 && num3 < num2) {
            System.out.println("Smallest is " + num3);
        }
        ;

        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        int average = (num1 + num2 + num3) / 3;
        System.out.println("sum is " + sum);
        System.out.println("product is " + product);
        System.out.println("average is " + average);

        input.close();
    }
}
