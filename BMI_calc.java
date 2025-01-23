import java.util.Scanner;

public class BMI_calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double height;
        double weight;

        System.out.print("Enter your height in (m) : ");
        height = sc.nextInt();
        System.out.print("Enter your weight : ");
        weight = sc.nextInt(); 
        
        double BMI = weight / (height * height);

        if(BMI < 18.5){
            System.out.println("You are underweight!");
        }
        else if(18.5 < BMI && BMI < 22.5){
            System.out.println("You are average!");
        }
        else{
            System.out.println("You are overweight!");
        }
        sc.close();
    }
}