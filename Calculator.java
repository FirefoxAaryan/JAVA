import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Enter 1(+), 2(-), 3(*), 4(/): ");
        int choice = sc.nextInt();
        
        int c = 0; 

        switch (choice) {
            case 1:
                c = a + b;
                break;
            case 2:
                c = a - b;
                break; 
            case 3:
                c = a * b;
                break; 
            case 4:
                if (b != 0) { 
                    c = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
                return; 
        }

        System.out.println("Output: " + c);
        sc.close();
    }
}
