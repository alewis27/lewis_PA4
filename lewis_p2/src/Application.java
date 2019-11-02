public class Application {

    public static void main(String[] args) {

        DuplicateCounter testCounter = new DuplicateCounter();
        testCounter.count("problem2.txt");
        testCounter.write("unique_words_count.txt");

    }
}
