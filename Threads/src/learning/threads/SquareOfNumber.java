package learning.threads;

//public class SquareOfNumber implements Runnable {
	public class SquareOfNumber extends Thread {

	@Override
	public void run() {
		
		for(int i = 50000; i < 1000000 ; i++) {
			System.out.println("Square of " +i+"is " +(i*i));
		}
	}

}
