import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Nth number you want : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        System.out.println(n + "th Fibonacci Number is : " + b);
    }
}
