public class StringExample {

	
		public void show() {
			char[] arr = {'j','a','v','a'};
			String s = new String(arr);// convert ch array to string
			System.out.println("value is:"+s);
			System.out.println(arr);
		}
public void myFunction() {
	String m = "java";//string literal
	String m1 = "java";
	String m2 = new String("java");//string new keyword
}
public static void main(String[] args) {
	StringExample obj = new StringExample();
	obj.show();
	obj.myFunction();
	}

}
