//Student Name: Chloe Chin
//LSU ID: 894023599

package filesproject;

import java.io.PrintWriter;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FilesProject {

	public static void main(String[] args) throws FileNotFoundException{
		try {
		PrintWriter out = new PrintWriter( fileName: "numbers.txt");
		Random rand = new Random();
		for (int i = 0; i<500;i++) {
			out.println(x:rand.nextInt(bound:50));
		}
		out.close();
	}
	catch (FileNotFoundException e) {
		System.out.println(x:e);
	}
	
}
}
