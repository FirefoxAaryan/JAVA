import java.util.Scanner;

public class Print_Odd{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of odd numbers : ");
        num = sc.nextInt();

        int i = 1;
        int count = 0;

        while(count < num){
            if(i % 3 == 0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        sc.close();
    }
}