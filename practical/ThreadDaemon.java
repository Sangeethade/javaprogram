public class ThreadDaemon extends Thread {
	    public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("I AM DAEMON");
		}else{
	        System.out.println("I AM USER");
		}
		
	    }

     	public static void main(String[] args) {
		ThreadDaemon t = new ThreadDaemon();
		ThreadDaemon t1 = new ThreadDaemon();
		ThreadDaemon t2 = new ThreadDaemon();
		t1.setDaemon(true);
		t.start();
		t1.start();
		t2.start();
	    }

        }
