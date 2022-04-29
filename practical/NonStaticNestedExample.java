public class NonStaticNestedClassExample {
	int a = 10;
	class Inner{
		void show() {
			System.out.println("the value is:"+a);
		}
	}

	public static void main(String[] args) {
		NonStaticNestedClassExample c = new NonStaticNestedClassExample();
		NonStaticNestedClassExample.Inner i = c.new Inner();
		i.show();

	}

}
