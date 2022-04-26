import.java.util.Scanner;
package javaprograms;

public interface LibraryUser {
void registerAccount();
void requestBook();
}
public class KidUsers implements LibraryUser{
	int age;
	String BookType;
	Scanner s = new Scanner(System.in);
	
}