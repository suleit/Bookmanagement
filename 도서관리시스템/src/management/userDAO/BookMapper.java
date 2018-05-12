package management.userDAO;

import java.util.ArrayList;

import management.vo.Book;
import management.vo.User;

public interface BookMapper {

	public int updateOverdue();
	public User findUser(String id);
	public int insertBook(Book book);
	public ArrayList<Book> findbook(String title);
	public int deletebook(Book book);
	public ArrayList<Book> findAllbook();
	public ArrayList<Book> findRentalBook();
	public ArrayList<Book> findOverdueBook();
	public ArrayList<Book> findBookForRent(String title);
	public ArrayList<Book> findBookForReturn(String title);
	
}
