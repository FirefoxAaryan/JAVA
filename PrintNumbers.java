import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of numbers to be print : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i <= num){
                System.out.println(i);
            }
        }
    }
}
