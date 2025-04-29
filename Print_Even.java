import java.util.Scanner;
public class Print_Even {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of even numbers: ");
        num = sc.nextInt();

        int count = 0;
        int i = 1;

        while(count < num) {
            if(i % 2 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }   
        sc.close();
    }
}
