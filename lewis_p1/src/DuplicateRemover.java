import java.util.*;
import java.io.*;

public class DuplicateRemover {
    private HashSet<String> uniqueWords;

    public void remove(String dataFile) throws FileNotFoundException {
        String wordInput;
        uniqueWords = new HashSet<String>();

        Scanner scnr = new Scanner(new File(dataFile));

        boolean createLoop = true;
        while(createLoop == true) {
            wordInput = scnr.next();
            uniqueWords.add(wordInput);
            if(scnr.hasNext() == false) {
                createLoop = false;
            }
        }
    }

    public void write (String outputFile) throws IOException {
        File fileName = new File(outputFile);
        FileWriter fileWriterVar = null;

        if(fileName.exists() == true) {
            fileWriterVar = new FileWriter(fileName, false);

            for (String stringVar : uniqueWords) {
                fileWriterVar.write(stringVar);
                fileWriterVar.write("\n");
            }

            fileWriterVar.close();
            System.out.println("Output File Has Been Created");
        }

        else {
            fileName.createNewFile();
            fileWriterVar = new FileWriter(fileName);

            for (String stringVar : uniqueWords) {
                fileWriterVar.write(stringVar);
                fileWriterVar.write("\n");
            }

            fileWriterVar.close();
            System.out.println("Output File Has Been Created");
        }
    }
}