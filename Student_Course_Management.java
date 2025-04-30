import java.util.*;

class CustomQueue<T>{
	public LinkedList<T> list = new LinkedList<>();

	@Override
	public String toString() {
		return list.toString();
	}
	
	public void enqueue(T item) {
		list.addFirst(item);
	}
	
	public T dequeue(){
		if(! isEmpty()) {
			return list.removeFirst();
		}
		return null;
	}
	
	public T front() {
		if(! isEmpty()) {
			return list.getFirst();
		}
		return null;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}

public class Student_Course_Management {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		CustomQueue<String> nameQueue = new CustomQueue<>();
		nameQueue.enqueue("Student 1");
		nameQueue.enqueue("Student 2");
		nameQueue.enqueue("Student 3");
		
		System.out.println("Students List : ");
		System.out.println(nameQueue);
		System.out.println("");
		
		CustomQueue<String> subjectList = new CustomQueue<>();
		subjectList.enqueue("1. Java");
		subjectList.enqueue("2. Python");
		subjectList.enqueue("3. Programming");
		
		System.out.println("Subjects List Offered by College : ");
		System.out.println(subjectList);
		System.out.println("");
		
		int choice1, choice2;
		System.out.println("Enter any 2 Subjects to enroll : ");
		choice1 = sc.nextInt();
		choice2 = sc.nextInt();
		System.out.println("");
		
		String subject1 = null;
		String subject2 = null;
		if(choice1 == 1) {
			subject1 = "Java";
		}
		else if(choice1 == 2) {
			subject1 = "Python";
		}
		else if(choice1 == 3) {
			subject1 = "Programming";
		}
		
		if(choice2 == 1) {
			subject2 = "Java";
		}
		else if(choice2 == 2) {
			subject2 = "Python";
		}
		else if(choice2 == 3) {
			subject2 = "Programming";
		}
		if(choice1 == choice2) {
			System.out.println("Error Retry Subject Enrollment !");
		}
		
		System.out.println("Registered !");
		System.out.println("Subject 1 : " + subject1);
		System.out.println("Subject 2 : " + subject2);
		System.out.println("");
	}
}
