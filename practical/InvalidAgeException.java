import java.util.Scanner;
public class CustomExceptionExample extends Exception {

	

	public CustomExceptionExample(String str) {
	super( str);
}
}

public class InvalidAgeException{
	public void CheckAge(int age) throws InvalidAgeException{
		if(age<=18 || age>=25) {
			throw new InvalidAgeException("invalid age for enrolling into java course");
		}
		else
			System.out.println("proper age for enrolling into java course");
		}
	
     public static void main(String[]args)  throws InvalidAgeException{
	InvalidAgeException c = new InvalidAgeException();
	Scanner s = new Scanner(System.in);
	System.out.println("ENTER THE AGE");
	int age = s.nextInt();
	c.CheckAge(age);
}
}