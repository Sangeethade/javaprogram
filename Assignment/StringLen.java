import java.util.Scanner;

public class StringLen {

	public static void main(String[] args) {
		String str ;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the String");
			str =s.nextLine();
		}
		int n = str.length();
		System.out.println("The String length of 'example.com'is:"+n);
		
		
		
		

	}

}
