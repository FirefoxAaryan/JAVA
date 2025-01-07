import java.util.Scanner;
public class PatternPrinting1{
    public static void main(String[] args){
        int row,column;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        row = in.nextInt();
        System.out.print("Enter the number of columns : ");
        column = in.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}