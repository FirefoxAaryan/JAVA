import java.util.Scanner;

public class Bank{
    static class bank{
    String Name;
    int Acc_num;
    int Balance;

    bank(String Name,int Acc_num,int Balance){
        this.Name = Name;
        this.Acc_num = Acc_num;
        this.Balance = Balance;
    }

    public void Print_Details(){
        System.out.println("\nName : " + this.Name);
        System.out.println("Account Number : " + this.Acc_num);
        System.out.println("Balance : " + this.Balance);
    }

    public void Add_amount(int amount){
        this.Balance += amount;
        System.out.print("New balance : " + this.Balance + "\n");
    }

    public void Withdraw_amount(int amount){
        this.Balance -= amount;
        System.out.print("New Balance : " + this.Balance + "\n");
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name;
        int acc_num;
        int balance;

        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Account Number : ");
        acc_num = sc.nextInt();
        System.out.print("Enter Balance : ");
        balance = sc.nextInt();

        bank c1 = new bank(name, acc_num, balance);
        int choice;        
        do { 
            System.out.println("\nWelcome " + name + "\n");
            System.out.print("1. Add amount \n2. Withdraw amount \n3. Display Details \n4. Exit \n");
            System.out.print("Choice : ");
            choice = sc.nextInt();

            if(choice == 1){
                int amount;
                System.out.print("Enter amount : ");
                amount = sc.nextInt();
                c1.Add_amount(amount);
            }

            else if(choice == 2){
                int amount;
                System.out.print("Enter amount : ");
                amount = sc.nextInt();
                c1.Withdraw_amount(amount);
            }
            
            else if(choice == 3){
                c1.Print_Details();
            }

            else if(choice == 4){
                break;
            }

            else{
                System.out.println("Enter coorect choice !");
            }
        } while (choice != 4);
    }
}