import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int rollno;
    int age;

    Student(String name, int rollno, int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollno);
        System.out.println("Age : " + this.age + "\n");
    }
}

public class StudentManagement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice = 4;
        do { 
            System.out.println("Welcome User !");
            System.out.println(" 1. Add Student \n 2. Display Student \n 3. Exit");
            System.out.print("Choice : ");
            choice = sc.nextInt();

            if(choice == 1){
                String name;
                int rollno;
                int age;
                
                System.out.print("\nEnter name : ");
                name = sc.next();
                System.out.print("Enter Roll Number : ");
                rollno = sc.nextInt();
                System.out.print("Enter age : ");
                age = sc.nextInt();

                Student newstudent = new Student(name, rollno, age);
                students.add(newstudent);
                System.out.println("Student Added Succesfully ! \n");
            }
            else if(choice == 2){
                if(students.isEmpty()){
                    System.out.println("List is empty !");
                }
                else{
                    if (students.isEmpty()) {
                        System.out.println("No students in the system.");
                    } else {
                        System.out.println("\nStudent List:");
                        for (Student student : students) {
                            student.displayDetails();
                        }
                    }
                }
            }
            else if(choice == 3){
                break;
            }
        } while (choice != 4);

        sc.close();
    }
}