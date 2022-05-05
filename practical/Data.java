public class Data {
	
	
int i;
boolean valueSet = false;
synchronized void produce (int i) {
	 if(valueSet)
	 try {
		 wait();
		 }
	 catch(Exception e) {
		 System.out.println(e);
		 }
		 this.i=i;
		 valueSet = true;
		 System.out.println("data production done" +i);
		 notify();
}
synchronized int consumer() {
     if(!valueSet) {
     try {
    	 wait();
    	 }
     catch(Exception e) {
         System.out.println(e);
    	 }
         System.out.println("data consumed"  + i);
         valueSet = false;
    	 notify();
    	 }
		 return i;
		 }
}
