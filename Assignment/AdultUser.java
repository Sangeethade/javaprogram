package javaprograms;
import java.util.Scanner;

public class AdultUser implements LibraryUser{
	int age;
	String bookType;
	Scanner s = new Scanner(System.in);
	@override
	public void registerAccount();
	System.out.println("Enter age:");
	int age =s.nextInt();
	if(age>12) {
		System.out.println("you are successfully registered to adult account");
	}else {
		System.out.println("sorry,age must be greater than 12 to register as an adult");
	}
	
	
	}
@override
public void requestBook() {
	System.out.println("Enter age:");
	String bookType = s.next();
	if(bookType =="fiction") {
		System.out.println("book issued successfully ,please return the book within 7 days");
	}else {
		System.out.println("oops,you are allowed to take only adult books");
	}
	}
}
