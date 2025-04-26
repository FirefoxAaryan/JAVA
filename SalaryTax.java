import java.util.Scanner;

class Tax{
    int Salary;

    Tax(int Salary){
        this.Salary = Salary;
    }

    public void calculateTax(){
        int tax;
    }
}

public class SalaryTax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do { 
            System.out.println("1. Calculate Tax");
            System.out.println("2. Exit");

            if(choice == 1){
                int Salary;
                System.out.print("Enter Salary : ");
                Salary = sc.nextInt();
                Tax User = new Tax(Salary);

                User.calculateTax();
            }
        } while (choice == 2);
    }
}