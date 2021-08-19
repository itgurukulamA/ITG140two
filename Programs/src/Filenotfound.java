import java.io.File;
import java.io.FileReader;

class Filenotfound {

	public static void main(String args[]) {
		try {

			File f = new File("D://NANDU.txt");
			FileReader fr = new FileReader(f);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}