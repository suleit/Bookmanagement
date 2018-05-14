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
		
		//for (int i = 1; i < 2; i++) {
				String[] strings= excelRead.get(1);
				Book b=new Book(strings[0], strings[1], strings[2]);
				System.out.println(b);
				boolean result=bd.insertBook(b);
				System.out.println(result);
	//	}// for
		
		
		
		

		
	
		
		
	}//main
}
