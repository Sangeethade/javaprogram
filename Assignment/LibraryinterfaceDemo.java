package javaprograms;

public class LibraryinterfaceDemo {

	public static void main(String[] args) {
		KidUsers k = new KidUsers();
		k.registerAccount();
k.requestBook();

AdultUser a = new AdultUser();
a.registerAccount();
a.requestBook();
	}

}
