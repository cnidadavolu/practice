package learning.threads;

public class ThreadTest {

	public static void main (String[] args) {
		
		SquareOfNumber sn = new SquareOfNumber();
//		Thread t1 = new Thread();
//		t1.start();
		sn.start();
		
		for(int j = 1; j < 50000 ; j++) {
			System.out.println("Square of " +j +"is " +(j*j));
	}
	
		
	}
}
