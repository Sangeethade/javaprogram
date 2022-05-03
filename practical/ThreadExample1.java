public class ThreadExample1 implements Runnable {
	@Override
	public void run() {
		System.out.println("i am thread.....thread is Runnable");
		
	}

	public static void main(String[] args) {
		ThreadExample1 t = new ThreadExample1();
		Thread th = new Thread();
		th.start();
		

	}
}