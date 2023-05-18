package Lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class question2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean isOn = true;
        int choice;
        while (isOn) {
            System.out.println("1. Input a name");
            System.out.println("2. Delete a name");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            try {
                choice = input.nextInt();
                input.nextLine(); // Consume the newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                input.nextLine(); // Consume the invalid input
                continue;
            }
            switch (choice) {

                case 1:
                    System.out.println("Input a name");
                    String name = input.nextLine();

                    if (name.trim().isEmpty()) {
                        System.out.println("Invalid input. Please enter a non-empty name.");
                        continue;
                    }
                    if (names.contains(name)) {
                        System.out
                                .println("This name is already inputed! try again with a different name or modify it.");
                        continue;
                    }
                    names.add(name);

                    break;
                case 2:

                    if (names.isEmpty()) {
                        System.out.println();
                        System.out.println("No names to delete. ");
                        break;
                    }
                    System.out.println();
                    System.out.println("Enter the name to delete: ");
                    String nameToDelete = input.nextLine();
                    if (names.contains(nameToDelete)) {
                        names.remove(nameToDelete);

                        System.out.println();
                        System.out.printf("%s has been removed ", nameToDelete);
                    } else {
                        System.out.println();
                        System.out.printf("%s is not found ", nameToDelete);
                    }
                    break;
                case 3:
                    isOn = false;
                    System.out.println("The program has ended");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            Collections.sort(names);
            for (String n : names) {
                System.out.print(n + ", ");
            }
            System.out.println();
        }

    }
}
