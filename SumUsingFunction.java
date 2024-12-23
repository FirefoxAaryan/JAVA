import java.util.Scanner;

public class SumUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter choice 1(START), 2(STOP)");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sum();
                    break;
                case 2:
                    System.out.println("Program stopped.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice != 2);
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
