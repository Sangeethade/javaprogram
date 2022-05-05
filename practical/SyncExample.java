public class SyncExample {

	public static void main(String[] args) {
		Sample s = new Sample();
		Thread1 t = new Thread1(s);
		Thread2 t1 = new Thread2(s);
		
	t.start();
	t1.start();
		

	}

}
