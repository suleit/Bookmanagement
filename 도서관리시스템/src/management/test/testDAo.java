package management.test;

import java.util.ArrayList;

import management.userDAO.BookDao;
import management.vo.Book;
import management.vo.User;

public class testDAo {

	public static void main(String[] args) {
		BookDao bd=new BookDao();		
/*		CSVRead cr=new CSVRead();
		ArrayList<String[]> excelRead=(ArrayList<String[]>) cr.readCsv();
		ArrayList<Book> booklist=new ArrayList<>();
		
			for (int i = 2; i < excelRead.size(); i++) {
				String[] strings= excelRead.get(i);
				Book b=new Book(strings[0], strings[1], strings[2]);
				//System.out.println(b.printBookInfo());
				boolean result=bd.insertBook(b);
				System.out.println(result);
		}// for
*/		
		
//		ArrayList<Book>books= bd.findBook("프로그래밍");
		
//		for (Book b : books) {
//			System.out.println(b);
//		}
		
//		User u1=bd.findUser("sul");
//		System.out.println(u1);
		
		

		
	
		
		
	}//main
}
