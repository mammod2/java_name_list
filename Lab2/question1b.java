package Lab2;

import java.util.Scanner;

public class question1b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int array_size = 5;
        int[] numbers = new int[array_size];
        int number;
        int count = 0;
        System.out.println("Please specify the size of the array you want to check");
        array_size = input.nextInt();
        System.out.printf("Input %d numbers that are more than 10 and less than 100", array_size);

        while (count < array_size) {
            number = input.nextInt();

            if (number < 10 || number > 100) {
                System.out.println("The number is too big or too small");
                System.out.println("Input another number");
                number = input.nextInt();
            }
            boolean isDuplicate = false;

            for (int i = 0; i < array_size; i++) {
                if (numbers[i] == number) {
                    System.out.println("There is a duplicate, input another number again !");
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate) {
                numbers[count] = number;
                count++;
            } else {
                System.out.println("Try again :(");

            }
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Exiting the program");
    }
}