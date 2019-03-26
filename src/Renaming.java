import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Renaming {
	public static void main(String[] args) throws IOException {
		File oldname= new File("//home//shashank//eclipse-workspace//FileHandling//output.txt");
		File newname= new File("//home//shashank//eclipse-workspace//FileHandling//outputchanged.txt");
		if(oldname.renameTo(newname))
			System.out.println("Successfully changed");
	}
}
