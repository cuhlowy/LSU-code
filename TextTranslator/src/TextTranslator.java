//Student Name: Chloe Chin
//LSU ID: 894023599

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextTranslator {
    public static void main(String[] args) {

    	Map<String, String> acronymMap = new HashMap<>();
        Scanner acronymScanner;
        try {
            acronymScanner = new Scanner(new File("acronyms.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Acronym doesn't exist!");
            return;
        }

        while (acronymScanner.hasNextLine()) {
            String line = acronymScanner.nextLine();
            String[] units = line.split("\\s+", 2);
            if (units.length == 2) {
                String acronym = units[0].trim().toLowerCase();
                String expanded = units[1].trim();
                acronymMap.put(acronym, expanded);
            }
        }
        acronymScanner.close();

        Scanner inputScanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.print("Enter a sentence: ");
        String input = inputScanner.next();
        inputScanner.close();

        
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        for (String word : words) {
            String punctuation = "";
            if (!Character.isLetter(word.charAt(word.length() - 1)) && !Character.isDigit(word.charAt(word.length() - 1))) {
                punctuation = String.valueOf(word.charAt(word.length() - 1));
                word = word.substring(0, word.length() - 1);
            }
            String expanded = acronymMap.get(word.toLowerCase());
            if (expanded != null) {
                result.append(expanded).append(punctuation).append(" ");
            } else {
                result.append(word).append(punctuation).append(" ");
            }
        }

        System.out.println("Expanded sentence: " + result.toString().toLowerCase());   
      }
}
