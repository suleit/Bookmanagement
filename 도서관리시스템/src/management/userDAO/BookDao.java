package management.userDAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import management.vo.Book;
import management.vo.DBvo;
import management.vo.User;

public class BookDao {
	private SqlSessionFactory factory= MybatisConfig.getSessionFactory();
	
	
	public boolean insertBook(Book book) {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.insertBook(book);
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;		
	}
	
	public boolean deleteBook(String book_id) {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.deletebook(book_id);
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;		
	}
	
	public boolean rentalBookhistory(String book_id, String user_id) {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.rentalBookhistory(book_id, user_id);
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;	
	}
	
	
	public boolean updateReceiveDate(String bookrental_id) {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.updateReceiveDate(bookrental_id);
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;	
	}
	public boolean updateReserveHistory(String bookrental_id, String user_id) {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.updateReserveHistory(bookrental_id, user_id);
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;
	}
	
	public User findUser(String user_id) {
		SqlSession session=null;
		User user=null;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			user=mapper.findUser(user_id);
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		return user;
	}
	
	public ArrayList<Book> findBook(String title){
		SqlSession session=null;
		ArrayList<Book> books=null;
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			books=mapper.findbook(title);
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		return books;
	}
	
	public ArrayList<Book> findAllBook(){
		SqlSession session=null;
		ArrayList<Book> books=null;
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			books=mapper.findAllbook();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return books;
	}
	
	public ArrayList<Book> findRentalBook(){
		SqlSession session=null;
		ArrayList<Book> books=null;
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			books=mapper.findRentalBook();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return books;
	}
	/**
	 *  DBvo로 받은 것을 user랑 book으로 갈라서 사용가능... 혹은 그냥 getter/setter로 가능
	 * @return
	 */
	public ArrayList<DBvo> findOverdueBook(){
		SqlSession session=null;
		ArrayList<DBvo> books=null;
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			books=mapper.findOverdueBook();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return books;
	}
	
	public ArrayList<Book> findBookForRent(String title){
		SqlSession session=null;
		ArrayList<Book> books=null;
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			books=mapper.findBookForRent(title);
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return books;
	}
	
	public ArrayList<Book> findBookForReturn(String title){
		SqlSession session=null;
		ArrayList<Book> books=null;
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			books=mapper.findBookForReturn(title);
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return books;
	}

	public boolean updateHistoryOverdue() {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.updatehistoryOverdue();
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;		
	}
	
	public boolean updateBook(String book_id) {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.updateBook(book_id);
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;		
		
	}
	
	public boolean removeRentalID(String bookrental_id) {
		SqlSession session=null;
		boolean result=false;
		int cnt=0;
		
		try {
			session= factory.openSession();
			BookMapper mapper= session.getMapper(BookMapper.class);
			cnt= mapper.removeRentalID(bookrental_id);
			if(cnt>0) {
				result=true;
			}
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return result;		
		
	}

}
