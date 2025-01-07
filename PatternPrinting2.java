import java.util.Scanner;

public class PatternPrinting2{
    public static void main(String[] args){
        int row,column;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        row = in.nextInt();
        System.out.print("Enter the number of columns : ");
        column = in.nextInt();

        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= column ; j++){
                if(i == 1 || j == 1 || i == row || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}