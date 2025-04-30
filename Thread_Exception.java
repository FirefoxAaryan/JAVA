class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + i);
            System.out.println(" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("EvenThread interrupted");
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + i);
            System.out.println(" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("OddThread interrupted");
            }
        }
    }
}

public class Thread_Exception{
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.setName("Even Thread");
        odd.setName("Odd Thread");

        even.start();
        odd.start();
    }
}
