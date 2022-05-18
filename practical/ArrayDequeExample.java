import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		 deque.add("ram");
		 deque.add("karan");
		 deque.add("mamta");
		 deque.add("sam");
		 deque.add("priya");
		 deque.add("ajay");
		 

		 
		 for(String s: deque) {
			 System.out.println(s);
		 }
		 
		 deque.addFirst("shree"); //adding from front side
		 deque.addLast("riya");  //adding from back side
		 
		 System.out.println("new list");
		 for(String s : deque) {
			 System.out.println(s);
		 }
		 deque.removeFirst();   //remove from front side
		 deque.removeLast();     //remove from back side
		 System.out.println("new list after removal");
		 for(String s : deque) {
			 System.out.println(s);
		 }
		 
		 
		 }
	}



