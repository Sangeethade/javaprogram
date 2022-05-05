public class Samplee1 {
   synchronized static void print(int num) {  //Sync  static Method
	   for(int i=1;i<=5;i++) {
		   System.out.println(num*i);
		   try {
			   Thread.sleep(500);
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	   }
   }
	class Threadd1 extends Thread{
		Sample t;
		
		public void run() {
			Samplee1.print(3);

	}
}
 class Threadd2 extends Thread{
	 Sample t;
	 public void run() {
		 Samplee1.print(5);
	 }
 }
}
