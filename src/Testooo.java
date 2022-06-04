import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Testooo {
	public static void main(String[]args) throws IOException {
		System.out.println("hello");
		String[] names = {"Frodo", "Gandalf", "Legolas"};
		
		//scanner
		File file = new File("/Users/ivan/Desktop/exampleText.txt");
		Scanner scan = new Scanner(file);
	
		//string file content
		String fileContent = "";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		scan.close();
		
		//fileWriter
		FileWriter writer = new FileWriter("/Users/ivan/Desktop/newFile.txt");
		writer.write(fileContent);
		writer.close();
		
		
		//BufferedWriter
		BufferedWriter writer2 = new BufferedWriter(new FileWriter("/Users/ivan/Desktop/bufferedOutput.txt"));
		writer2.write("this is buffered writer");
		for(String name : names) {
			writer2.write("\n" + name);
		}
		writer2.close();
		
		//BufferedReader
		
		
		
		
		
	}

}
