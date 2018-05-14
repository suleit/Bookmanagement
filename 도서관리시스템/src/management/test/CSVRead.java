package management.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import au.com.bytecode.opencsv.CSVReader;
 
public class CSVRead {
 
    private String filename = "bookList.csv";
 
    public CSVRead() {}
 
    public List<String []> readCsv() {
 
        try {
            CSVReader reader = new CSVReader(new FileReader(filename));
            // UTF-8
            // CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"), ",", '"', 1);
            String[] s;
            while ((s = reader.readNext()) != null) {
                data.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        return data;
    }
}