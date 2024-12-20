import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Enter the first number :");
        a = sc.nextInt();
        System.out.print("Enter the second number :");
        b = sc.nextInt();

        int c = a + b;

        System.out.println("Sum of numbers : " + c);
    }
}
