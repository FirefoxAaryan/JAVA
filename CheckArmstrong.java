import java.util.Scanner;

public class CheckArmstrong{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the three digit number : ");
        int n = in.nextInt();

        boolean result = Check(n);

        String result1 = result ? "Armstrong" : "not Armstrong";

        System.out.println("Number is " + result1 + " number!");
    }

    static boolean Check(int a){
        int sum = 0;
        int Original = a;
        while(a > 0){
            int rem = a % 10;
            int c = rem * rem * rem;
            sum += c;
            a /= 10;
        }
        if(sum == Original){
            return true;
        }
        else{
            return false;
        }
    }
}