public class StaticNestedClassExample {
	
	   
	static int a = 10;

	   class Inner{
		   void show() {
			   System.out.println("the value is:"+a);
		   }
	   
	   public static void main(String[] args) {
		StaticNestedClassExample.show.Inner();
		
		

	}

}
}