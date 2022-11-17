package Countries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	void writeData() {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("text.txt",true);
			fileWriter.write("Welcome to file handling\n");
			fileWriter.write("Welcome to file handling 2\n");
			fileWriter.write("Welcome to file handling 3\n");
			fileWriter.append("Welcome to file handling 5\n");
			fileWriter.write("Welcome to file handling");
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	void readData() {
		
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fileReader);
			String data = "";
			while(br.readLine()!=null)
			{
				System.out.println(br.readLine());
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		
		new FileHandling().writeData();
		new FileHandling().readData();
	}

}
