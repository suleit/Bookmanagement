package management.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class CSVRead {

  private String filename = "C:\\Users\\suhyun\\git\\Bookmanagement\\도서관리시스템\\src\\bookList.csv";

  public CSVRead() {}

  public List<String[]> readCsv() {

    List<String[]> data = new ArrayList<String[]>();

    try {
      // CSVReader reader = new CSVReader(new FileReader(filename), '\t');
      // UTF-8
      CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(filename), "MS949"));
      
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
  } //
}//class