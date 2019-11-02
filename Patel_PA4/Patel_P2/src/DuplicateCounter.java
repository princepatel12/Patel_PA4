import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    private Integer wordCounter;
    private Map<String, Integer> map;

    public DuplicateCounter()
    {
        this.wordCounter = 0;
        this.map = new HashMap<>();
    }

    public void count(String dataFile)
    {

        Scanner FileIn;

        try
        {
            FileIn = new Scanner(new File(dataFile));
            while(FileIn.hasNextLine())
            {
                String lineUse = FileIn.nextLine().trim();
                String[] LData = lineUse.split("[\\W]+");
                for(String word : LData)
                {
                    this.wordCounter = map.get(word);
                    this.wordCounter = (this.wordCounter == null) ? 1 : ++this.wordCounter;
                    map.put(word, this.wordCounter);
                }
            }
            FileIn.close();
        }

        catch(FileNotFoundException FNFE){
            System.out.println("File " + dataFile + " cannot be found!");
            System.exit(1);
        }

        System.gc();
    }

    public void write(String outputFile)
    {
        FileWriter fWrite;
        PrintWriter pWrite;

        try {
            fWrite = new FileWriter(new File(outputFile));
            pWrite = new PrintWriter(fWrite);
            for(Map.Entry<String, Integer> entry : map.entrySet())
            {
                pWrite.write(entry.getKey() + " occurs " + entry.getValue() + " times" + System.lineSeparator());
            }
            System.out.println("Map data to file: " + outputFile);
            pWrite.flush();
            fWrite.close();
            pWrite.close();
        }

        catch (IOException err) {
            System.out.println("Error writing to " + outputFile + ": " + err.getMessage());
            System.exit(1);
        }

        System.gc();
    }
}