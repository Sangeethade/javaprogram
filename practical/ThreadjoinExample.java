public class ThreadjoinExample extends Thread{
   public void run() {
	   for(int i=1;i<=5;i++) {
		   try {
			   Thread.sleep(1000);
		   }catch(InterruptedException e) {
		   System.out.println(e);
	   }
		   System.out.println(i);
   }
   }
	public static void main(String[] args) {
		ThreadjoinExample t = new ThreadjoinExample();
		ThreadjoinExample t1 = new ThreadjoinExample();
		ThreadjoinExample t2 = new ThreadjoinExample();
		 
		t.start();
		try {
			t.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
        t1.start();
        t2.start();    
	}

}
