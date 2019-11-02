import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException {

        DuplicateRemover testRemover = new DuplicateRemover();
        testRemover.remove("problem1.txt");
        testRemover.write("unique_words.txt");
    }
}
