import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException{
		FileReader fr=null;
		int ch;
		try {
			 fr=new FileReader("//home//shashank//eclipse-workspace//FileHandling//output.txt");
			}
		catch (FileNotFoundException e){
			System.out.println("File not found");
		}
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	} 
}
