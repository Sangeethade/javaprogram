package javaprograms;
import java.util.Scanner;

public class KidUsers implements LibraryUser{
	int age;
	String BookType;
	Scanner s = new Scanner(System.in);
	@override
	public void registerAccount();
	System.out.println("Enter age:");
	int age = s.nextInt();
	if(age<12) {
		System.out.println("you are successfully registered under a kids account");
	}else {
		System.out.println("sorry age must be less than12 to register as a kid");
	}
	
	}
public void requestBook{
	System.out.println("Enter bookType is:");
	String bookType = s.next();
	if(bookType =="kids") {
		System.out.println("book issued successfully please return the book within 10 days");
	}else {
		System.out.println("you are allowed to take only kids books");
	}
	

	}

}
