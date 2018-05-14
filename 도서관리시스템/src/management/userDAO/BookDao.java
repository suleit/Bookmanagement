package management.userDAO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import management.vo.Book;

public class BookDao {
	private SqlSessionFactory factory= MybatisConfig.getSessionFactory();
	SqlSession session=null;
	
	public boolean insertBook(Book book) {
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
	
	
	

}
