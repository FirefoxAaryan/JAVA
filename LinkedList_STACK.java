
import java.util.LinkedList;

class CustomStack<T>{
    public LinkedList<T> List = new LinkedList<>();

    public void push(T item){
        List.addLast(item);
    }

    public T pop(){
        if(!isEmpty()){
            return List.removeLast();
        }
        return null;
    }

    public T peek(){
        if(!isEmpty()){
            return List.getLast();
        }
        return null;
    }

    public boolean isEmpty(){
        return List.isEmpty();
    }

    @Override
    public String toString(){
        return List.toString();
    }
}

public class LinkedList_STACK{
    public static void main(String args[]){
        CustomStack<String> lsit = new CustomStack<>();
        lsit.push("Hello");
        System.out.println(lsit);
    }
}

