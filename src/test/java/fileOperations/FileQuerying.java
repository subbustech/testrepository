package fileOperations;

import java.io.File;
import java.io.IOException;

public class FileQuerying {

	public static void main(String[] args) throws IOException {
		
		File tmpDir = new File("D:\\seleniumpractice\\FileOperations");
		File tmpFile = new File(tmpDir+"\\samplefile.txt");

//		if(tmpDir.isDirectory()) {
//			System.out.println("This is a directory");
//		}
		
//		if(tmpDir.exists()) {
//			System.out.println("The directory exists");
//		}
		
//		if(tmpFile.isFile()) {
//			System.out.println("This is file");
//		}
		
//		if(tmpFile.exists()) {
//			System.out.println("The file exists");
//		}
//		
//		if(tmpFile.canRead()) {
//			System.out.println("The file can be read");
//		}
//		if(tmpFile.canWrite()) {
//			System.out.println("The file can be written");
//		}
//		
//		if(tmpFile.isHidden()) {
//			System.out.println("The file is hidden");
//		}
//		else {
//			System.out.println("The file is not hidden");
//		}
//		
//		File path = tmpFile.getAbsoluteFile();
//		System.out.println(path);
//		
//		File file = new File(tmpDir+"\\Sample1.txt");
//		
//		if(file.createNewFile()) {
//			System.out.println("File created successfully.");
//		}
//		
		File dir = new File(tmpDir+"\\test");
		if(dir.mkdir()) {
			System.out.println("Directory Created Successfully");
		}

	}

}
