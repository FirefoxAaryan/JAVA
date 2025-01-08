import java.util.Scanner;

public class Array_Intro{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int[] marks = new int[3];

        //INPUT : 
        System.out.println("Enter the marks : ");
        for(int i = 0; i < 3; i++){
            marks[i] = in.nextInt();
        }

        //OUTPUT :
        System.out.print("Marks of the student are : ");
        for(int i = 0; i < 3; i++){
            System.out.print(marks[i]+" ");
        }
    }
}