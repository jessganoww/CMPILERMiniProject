import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileReader {
	private static final String DIRECTORY = "files/"; 
	
	public static List<String> readPerLine(String filename) {
		Scanner sc;
		List<String> expressionList = new ArrayList<String>();
		
		try {
			sc = new Scanner(new File(DIRECTORY + filename));
			
			while(sc.hasNextLine()) {
				expressionList.add(sc.nextLine());
			}

			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		
		return expressionList;
	}

}
