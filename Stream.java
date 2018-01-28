/* Lab 2 Java
 * Roger Robinson
 * Date: 1/28/2018
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Stream {
	
	public void recipe() throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File("Recipe.txt");
		file.createNewFile();
		PrintWriter print = new PrintWriter(file);
		String recipe = "";
		while(!recipe.equals(" ")) {
			System.out.print("Enter recipe name");
			recipe = scan.nextLine();
			if(!recipe.equals(" ")) {
			print.print(recipe+System.getProperty("line.separator"));
			}
		}
		scan.close();
		print.close();
	}

}
