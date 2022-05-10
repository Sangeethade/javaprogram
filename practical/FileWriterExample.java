import java.io.FileReader;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			//FileWriter fw = new FileWriter(E:\\test.txt");
			//fw.write("welcome to anudip foundation");
			
			FileReader fr = new FileReader("E://test.txt");
			int i ;
			while((i=fr.read())!=1) {
				System.out.println((char)i);
			}
			fr.close();
			System.out.println("done");
			}catch (Exception e ) {
				System.out.println(e);
		}

	}

}
