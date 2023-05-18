import java.util.Scanner;

/**
 * lab1
 */
public class lab1b {

    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);

        int productNo = 1;
        int quantity;
        double product1Total = 0;
        double product2Total = 0;
        double product3Total = 0;
        while (productNo != 0) {
            System.out.println("Enter the product number (1-3) (0 to stop)");
            productNo = print.nextInt();

            System.out.println("Enter quantity sold: ");
            quantity = print.nextInt();

            switch (productNo) {
                case 1:
                    product1Total += 2.98 * quantity;
                    break;
                case 2:

                    product2Total += 4.50 * quantity;
                    break;
                case 3:
                    product3Total += 9.98 * quantity;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
        System.out.println("Product 1: " + product1Total);
        System.out.println("Product 1: " + product2Total);
        System.out.println("Product 1: " + product3Total);
    }
}