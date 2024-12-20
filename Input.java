import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        int marks = input.nextInt();
        System.out.print("Enter your Name : ");
        String name = input.next();
        System.out.println("Hello "+name);
        System.out.println("Your marks are : " + marks);
    }
}