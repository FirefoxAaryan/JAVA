import java.util.Scanner;

class students{
    String name;
    int age;

    students(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display_info(){
        System.out.println("Name of student is : " + this.name);
        System.out.println("Age of the student is : " + this.age);
    }
}

public class Student_Record {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter name of the student : ");
        name = sc.nextLine();
        System.out.print("Enter age of the student : ");
        age = sc.nextInt();

        students s1 = new students(name, age);
        s1.display_info();

        sc.close();
    }
}
