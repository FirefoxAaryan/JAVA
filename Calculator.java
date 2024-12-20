import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Enter the first number :");
        a = sc.nextInt();
        System.out.print("Enter the second number :");
        b = sc.nextInt();

        System.out.println("Enter 1(+), 2(-), 3(*), 4(/) : ");
        int choice = sc.nextInt();
            int c = 0;      
        if(choice == 1){
            c = a + b;
        }
        else if(choice == 2){
            c = a - b;
        }
        else if(choice == 3){
            c = a * b;
        }
        else if(choice == 4){
            c = a / b;
        }
        else{
            System.out.println("Enter a valid choice !");
        }

        System.out.println("Output : " + c);
    }
}
