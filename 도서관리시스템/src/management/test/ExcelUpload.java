package management.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import management.vo.Book;


public class ExcelUpload {
    public static void main(String[] args) {
    	Book book;
    	ArrayList<Book> bookList = new ArrayList<>();
		
        // 颇老 按眉 积己 - 竣伎颇老 版肺
        File file = new File("C:\\Users\\suhyun\\git\\Bookmanagement\\档辑包府矫胶袍\\src\\booklist.xls");
         
        try {
            // 竣伎颇老 况农合 按眉 积己
            Workbook workbook = Workbook.getWorkbook(file);
             
            // 矫飘 瘤沥
            Sheet sheet = workbook.getSheet(0);
            
            // 青 辨捞
            int endIdx = sheet.getColumn(1).length-1;
            System.out.println(endIdx);
             
            for(int i=1; i <= endIdx; i++) {
        		book = new Book();
        		book.setTitle(sheet.getCell(0, i).getContents());
        		book.setPublisher(sheet.getCell(1, i).getContents());
              	bookList.add(book);
            }
            for(Book b : bookList)
            {
            	System.out.println(b);
            }
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    } 
}