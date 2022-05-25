import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Testooo {
	public static void main(String[]args) throws IOException {
		System.out.println("hello");
		
		File file = new File("/Users/ivan/Desktop/exampleText.txt");
		Scanner scan = new Scanner(file);
	
		
		String fileContent = "";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		
		FileWriter writer = new FileWriter("/Users/ivan/Desktop/newFile.txt");
		writer.write(fileContent);
		writer.close();
		
	}

}
