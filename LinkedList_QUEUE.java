import java.util.LinkedList;

class CustomQueue<T>{
    public LinkedList<T> list = new LinkedList<>();

    @Override
    public String toString() {
        return list.toString();
    }

    public void enqueue(T item){
        list.addLast(item);
    }

    public T dequeue(){
        if(!isEmpty()){
            return list.removeFirst();
        }
        return null;
    }
    
    public T front(){
        if(!isEmpty()){
            return list.getFirst();
        }
        return null;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}


public class LinkedList_QUEUE{
    public static void main(String args[]){
        CustomQueue <Integer> NumberQueue = new CustomQueue<>();
        NumberQueue.enqueue(200);
        NumberQueue.enqueue(400);
        System.out.println(NumberQueue);

        CustomQueue <String> NameQueue = new CustomQueue<>();
        NameQueue.enqueue("Hello");
        System.out.println(NameQueue);
    }
}