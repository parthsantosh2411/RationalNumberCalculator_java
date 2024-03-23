import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first rational number (in the format 'a/b'): ");
            String input1 = scanner.nextLine();
            String[] parts1 = input1.split("/");
            int num1 = Integer.parseInt(parts1[0]);
            int denom1 = Integer.parseInt(parts1[1]);

            System.out.print("Enter the second rational number (in the format 'a/b'): ");
            String input2 = scanner.nextLine();
            String[] parts2 = input2.split("/");
            int num2 = Integer.parseInt(parts2[0]);
            int denom2 = Integer.parseInt(parts2[1]);

            RationalNumber rational1 = new RationalNumber(num1, denom1);
            RationalNumber rational2 = new RationalNumber(num2, denom2);

            System.out.println("First rational number: " + rational1);
            System.out.println("Second rational number: " + rational2);
            System.out.println("Sum: " + rational1.add(rational2));
            System.out.println("Difference: " + rational1.subtract(rational2));
            System.out.println("Product: " + rational1.multiply(rational2));
            System.out.println("Quotient: " + rational1.divide(rational2));
            System.out.println("Absolute value of first number: " + rational1.abs());
            System.out.println("Absolute value of second number: " + rational2.abs());
            System.out.println("First number as floating point: " + rational1.toDouble());
            System.out.println("Second number as floating point: " + rational2.toDouble());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input format. Please enter rational numbers in the format 'a/b'.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}