public class SequentialExample {
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
		SequentialExample t = new SequentialExample();
		SequentialExample t1 = new SequentialExample();
		SequentialExample t2 = new SequentialExample();
		
		
		t.run();
		t1.run();
		t2.run();
	}

}
