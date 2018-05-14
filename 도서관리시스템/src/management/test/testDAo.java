package management.test;

import java.util.ArrayList;

import management.userDAO.BookDao;
import management.vo.Book;

public class testDAo {

	public static void main(String[] args) {
		
		
		CSVRead cr=new CSVRead();
		BookDao bd=new BookDao();
		ArrayList<String[]> excelRead=(ArrayList<String[]>) cr.readCsv();
		ArrayList<Book> booklist=new ArrayList<>();
		
			for (int i = 2; i < excelRead.size(); i++) {
				String[] strings= excelRead.get(i);
				Book b=new Book(strings[0], strings[1], strings[2]);
				//System.out.println(b.printBookInfo());
				boolean result=bd.insertBook(b);
				System.out.println(result);
		}// for
		
		
		
		

		
	
		
		
	}//main
}
