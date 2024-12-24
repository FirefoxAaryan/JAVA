import java.util.Scanner;

public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Enter the number to check : ");
        n = sc.nextInt();

        boolean result = Check(n);

        //INITIALIZE RESULT 1 USING A SIMPLE IF ELSE BLOCK
        String result1 = result ? "Prime" : "not Prime";

        System.out.println("Number is " + result1);
    }

    static boolean Check(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        if(c * c > n){
            return true;
        }
        return false;
    }
}