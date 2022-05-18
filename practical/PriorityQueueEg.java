import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		PriorityQueue<String> qu = new PriorityQueue<String>();
		qu.add("ram");
		qu.add("karan");
		qu.add("mamta");
		qu.add("sam");
		qu.add("priya");
		qu.add("ajay");
		 System.out.println("peek element: "+qu.peek());
		 
		 Iterator<String> itr = qu.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 qu.remove();
		 System.out.println("queue after removing an element");
		 Iterator<String> itr1 = qu.iterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
		 }
		 }
		
	}


