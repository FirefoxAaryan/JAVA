import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer number :");
        float a = sc.nextInt();
        System.out.println("TypeConversion to float : " + a);

        System.out.print("Enter the float number :");
        int b = (int)(sc.nextFloat());
        System.out.println("TypeCasting to integer : " + b);
    }
}
