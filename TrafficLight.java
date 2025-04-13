import java.util.Scanner;

enum Light {
    RED("RED : STOP"),
    YELLOW("YELLOW : SLOW DOWN"),
    GREEN("GREEN : GO");

    String desc;

    Light(String desc) {
        this.desc = desc;
    }
}

class TL {
    public void changeLight(Light input) {
        System.out.println(input.desc);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {

        }
    }        
}

public class TrafficLight {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int count;
    TL A = new TL();
    System.out.print("Enter number of cycles ");
    count = sc.nextInt();
    System.out.println("");
        for(int i = 0; i < count; i++){
            A.changeLight(Light.RED);
            A.changeLight(Light.GREEN);
            A.changeLight(Light.YELLOW);
            System.out.println("");
        }
    }
}
