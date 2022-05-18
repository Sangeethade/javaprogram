import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "mango");
		map.put(108,"orange");
		map.put(105,"banana");
		map.put(103, "grapes");
		map.put(105,"banana"); //duplicate entry
		map.put(null,null);  //null entry
		map.put(102, null);  //null value
		//map.put(null,"apple");
		map.putIfAbsent(102,"custardapple"); //102 was mapped wth null,update 102
		map.putIfAbsent(101,"watermelon");   //101 is already mapped with value
		
		
		
	  for(Map.Entry m : map.entrySet()){
		  System.out.println(m.getKey()+" "+m.getValue());
		  
		  
		  
		  map.remove(103);
		  System.out.println("after removal");
		  for(Map.Entry m1 : map.entrySet()) {
			  System.out.println(m1.getKey()+" "+m1.getValue());
		  }
	  }

	}

}
