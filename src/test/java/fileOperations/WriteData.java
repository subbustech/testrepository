package fileOperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\seleniumpractice\\FileOperations\\samplefile.txt");
			int i;
			while((i = fr.read())!= -1){
				System.out.print((char)i);
			}
		}
		catch(Exception e){
			System.out.println("The file is not found or there is some problem with the file");
			System.out.println(e);
		}
		finally {
			fr.close();
		}



	}

}
