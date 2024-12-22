import java.util.Scanner;

public class CheckOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the number to check occurence : ");
        int num1 = sc.nextInt();

        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == num1){
                count++;
            }
            num = num / 10;
        }

        System.out.println(num1 +" occurs " + count + " times in the number !");
    }
}
