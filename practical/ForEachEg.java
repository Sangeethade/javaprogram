import java.util.ArrayList;
import java.util.List;

public class ForEachEg {
		public static void main(String[]args){
			List<String>flower = new ArrayList<String>();
		flower.add("Rose");
		flower.add("Sunflower");
		flower.add("Marigold");
		flower.add("Lilly");
		flower.forEach(display ->System.out.println(display));//iterating with lambda exp
		flower.forEach(System.out::println);
		}
		}
