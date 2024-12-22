import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Word : ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Character is Lower Case !");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Character is Upper Case !");
        }
        else{
            System.out.println("Character is not an Alphabet !");
        }
    }
}