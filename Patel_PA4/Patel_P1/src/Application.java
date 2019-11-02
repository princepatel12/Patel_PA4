import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        DuplicateRemover dupe = new DuplicateRemover();
        dupe.remove("problem1.txt");
        dupe.Write("unique_words.txt");


    }

}