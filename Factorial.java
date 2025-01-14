import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter the number for factorial : ");
        num = sc.nextInt();

        int fact = Factorial(num);
        System.out.println("Factorial of " + num + " = " + fact);
        }

    public static int Factorial(int num){
        int factorial = 1;

        if(num >= 0){
            for(int i = num; i > 0; i--){
                factorial *= i;
            }
        }
        else{
            System.out.println("There are no factorials for negative numbers !");
            return 0;
        }
        return factorial;
    }
}