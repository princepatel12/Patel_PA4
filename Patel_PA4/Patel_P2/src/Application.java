public class Application {

    private static final String getInput = "problem2.txt";
    private static final String putOut = "unique_word_counts.txt";

    public static void main(String[] args)
    {
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        duplicateCounter.count(getInput);
        duplicateCounter.write(putOut);
    }
}