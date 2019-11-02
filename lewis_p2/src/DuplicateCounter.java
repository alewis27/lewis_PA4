import java.io.*;
import java.util.*;

public class DuplicateCounter {

    private HashMap<String, Integer> wordCounter = new HashMap<String,Integer>();

    public void count (String dataFile) {

        Scanner scnr;

        try {
            scnr = new Scanner(new File(dataFile));
        }
        catch (FileNotFoundException excpt) {
            System.out.println("ERROR: " + excpt.getMessage());
            return;
        }

        while(scnr.hasNext() == true) {
            String wordToCheck = scnr.next();
            Integer countOfSpecificWord = wordCounter.get(wordToCheck);

            if (countOfSpecificWord != null){
                ++countOfSpecificWord;
            }

            else {
                countOfSpecificWord = 1;
            }

            wordCounter.put(wordToCheck, countOfSpecificWord);
        }
    }

    public void write (String outputFile) {

        try {
            PrintWriter fileToOutput = new PrintWriter(new File(outputFile));
            fileToOutput.println("WORDS & COUNT:\n");

            for(String distinctWords : wordCounter.keySet()) {
                fileToOutput.println(distinctWords + ": " + wordCounter.get(distinctWords));
            }

            System.out.println("Output File Has Been Created");
            fileToOutput.close();
        }
        catch (FileNotFoundException excpt) {
            System.out.println("ERROR: " + excpt.getMessage());
        }
    }
}