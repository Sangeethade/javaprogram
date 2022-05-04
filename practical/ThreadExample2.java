public class ThreadExample2 extends Thread  {
	 public void run() {
		 for(int i = 0;i<5;i++) {
			 try {
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				 System.out.println(e);
			 }
			 System.out.println(i);
		 }
		 System.out.println(Thread.currentThread().getName()); 
		System.out.println(Thread.currentThread().getPriority());	
			
		 }
	 

	public static void main(String[] args) {
		
		ThreadExample2 t = new ThreadExample2();
		ThreadExample2 t1 = new ThreadExample2();
		ThreadExample2  t2 = new ThreadExample2();
		
		t.start();
		t1.start();
		t2.start();
		

		t1.setName("I AM A THREAD");
		t2.setPriority(MAX_PRIORITY);
}
}