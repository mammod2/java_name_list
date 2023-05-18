package lab1a;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        separateDigits();
    }

    public static void separateDigits() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();
        String numberString = String.valueOf(number);

        // Separate the digits and print them
        for (int i = 0; i < numberString.length(); i++) {
            System.out.print(numberString.charAt(i) + "   ");
        }
        input.close();
    }
}
