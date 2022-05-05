public class Samplee {
   synchronized void print(int num) {  //Sync Method
	   for(int i=1;i<=5;i++) {
		   System.out.println(num*i);
		   try {
			   Thread.sleep(500);
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	   }
   }
	class Thread1 extends Thread{
		Samplee t;
		
		public Thread1 (Samplee t) {
			this.t=t;
		}
		class Thread2 extends Thread{
			Samplee t;
			
			public Thread2 (Samplee t) {
				this.t=t;
			}
	}

	}
}