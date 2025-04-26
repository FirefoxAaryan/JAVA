interface animal{
    void sound();
}

class Animal{
    String type;
}

class dog extends Animal{
    public void sound(){
        System.out.println("Woof");
    }
}

class cat extends Animal{
    public void sound(){
        System.out.println("MEOW");
    }
}

public class Interface{
    public static void main(String Args[]){
        dog d = new dog();
        d.sound();
        cat c = new cat();
        c.sound();

    }
}
