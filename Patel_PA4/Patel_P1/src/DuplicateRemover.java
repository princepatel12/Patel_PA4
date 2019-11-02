import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    private Set<String> uniqueWords;

    public void remove(String dataFile) throws FileNotFoundException
    {
        String txtword;
        uniqueWords = new HashSet<String>();
        Scanner scnr = new Scanner(new File(dataFile));
        while(scnr.hasNext())
        {
            txtword=scnr.next();
            uniqueWords.add(txtword);
        }
        scnr.close();


    }


    public void Write(String outputFile) throws IOException
    {
        File txtFile;
        FileWriter fw = null;

        txtFile = new File(outputFile);

        if(txtFile.exists()) {
            fw = new FileWriter(txtFile,true);
            Iterator nitr  =uniqueWords.iterator();

            while(nitr.hasNext())
            {
                String str = (String)nitr.next();
                fw.write(str+"\n");
            }
            fw.close();
            System.out.println("Data Written to File");

        }
        else
        {

            txtFile.createNewFile();
            fw=new FileWriter(txtFile);
            Iterator itr=uniqueWords.iterator();

            while(itr.hasNext())
            {
                String str=(String)itr.next();
                fw.write(str+"\n");
            }
            fw.close();
            System.out.println("Data Written to File");
        }
        System.gc();
    }

}