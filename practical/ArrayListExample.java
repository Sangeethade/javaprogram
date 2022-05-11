import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		                                             //creating a arraylist
		List <String> al = new ArrayList<String>();
		
		                                            //adding object to arraylist
		al.add("rose");
		al.add("sunflower");
		al.add("rose");
		al.add(0,"lily");
		al.add(2, "daisy");
	    al.add("marigold");
		al.add(6,"tulip");
		al.add("jasmine");
		al.add("orchid");
		al.add("lotus");
		al.add(5,"lavender");
		
		
		                                           //printing arraylist object
		System.out.println(al);
		System.out.println("size of arraylist:"+al.size());
		
		
		                                          //printing elements of index
		al.remove(5);
		
		                                          //printing arraylist after remove elements
		
	    System.out.println(al);
	    System.out.println("size of arraylist:"+al.size());
	    al.add("lavender");
	    al.add("lotus");
	    System.out.println(al);
	    System.out.println("size of arraylist:"+al.size());
	    System.out.println("size of arraylist:"+al.get(6));
	
	
	
	}

}