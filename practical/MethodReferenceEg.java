@FunctionalInterface 
public interface Sample {
	void display(String a);   //abstract method
	

}
public class MethodReferenceEg {
	public void display(String a) {
		System.out.println("hello...I am "+a);
	}

	public static void main(String[] args) {
		MethodReferenceEg m = new MethodReferenceEg();
		Sample s = m::display;
		s.display("mamta");
		
		

	}

}
