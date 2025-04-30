class countdown extends Thread{
	public void run() {
		for(int i = 10; i >= 0; i--) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Timer Interrupted");
			}
		}
	}
}

public class Countdown_Thread {
	public static void main(String args[]) {
		countdown timer = new countdown();
		timer.setName("Countdown");
		timer.start();
	}
}
