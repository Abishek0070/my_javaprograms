import java.util.Scanner; // Import the Scanner class

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); // take integer input

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2; // add numbers
        System.out.println("Sum = " + sum);

        sc.close(); // close scanner
    }
}
