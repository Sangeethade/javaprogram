import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {
		byte [] arr = {68,37,35,70,30};
		ByteArrayInputStream bin = new ByteArrayInputStream(arr);
		
		int i= 0;
		while ((i=bin.read())!=1) {
			char ch =(char)i;
			System.out.println("ASCII CHARACTER "+i+"VALUE IS"+ch);
		}
	}

}