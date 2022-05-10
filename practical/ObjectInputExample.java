import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {

	

	public static void main(String[] args) {
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("E://ab.txt"));
			Student s =  (Student) oi.readObject();
			System.out.println("id is: "+s.id+ "name is :" +s.sname + "fees is : "+s.fees);
			oi.close();
		}catch(Exception e) {
			System.out.println(e);
			}

	}

}
