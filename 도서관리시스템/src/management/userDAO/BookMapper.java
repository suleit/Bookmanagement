package management.userDAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import management.vo.Book;
import management.vo.DBvo;
import management.vo.User;

public interface BookMapper {

	/**
	 * 연체일 계산 (프로그램 시작시마다 수행)
	 * @return
	 */
	public int updateOverdue();
	/**
	 *  이용자 검색-로그인시 사용
	 * @param id 값을 string으로 받아서 사용함
	 * @return
	 */
	public User findUser(String user_id);
	/**
	 * 신규도서삽입
	 * @param book
	 * @return
	 */
	public int insertBook(Book book);
	/**
	 * 해당 제목이 포함된 책들의 상황 출력
	 * @param title (책제목)
	 * @return
	 */
	public ArrayList<Book> findbook(String title);
	/**
	 * 도서 삭제 (훼손 등) 책 삭제 
	 * @param book
	 * @return
	 */
	public int deletebook(Book book);
	/**
	 * 모든 도서 상황 검색하여 나타내기 
	 * @return
	 */
	public ArrayList<Book> findAllbook();
	/**
	 * 현재 대여중인 모든 책들의 정보 출력 (반납이 안된 책)
	 * @return
	 */
	public ArrayList<Book> findRentalBook();
	/**
	 * 미반납된 연체상태의 책들 나타내기 (대여자의 상세정보 포함)
	 * @return
	 */
	public ArrayList<DBvo> findOverdueBook();
	/**
	 * 빌릴책 검색 - 이름으로 
	 * 예약자와 대여자가 꽉 차있는 도서는 검색이 안 되도록/반납일 null 예약아이디 null
	 * @param title
	 * @return
	 */
	public ArrayList<Book> findBookForRent(String title);
	/**
	 *  반납할 책 검색- 이름으로
	 *  반납일이 null인 것만 검색 
	 * @param title
	 * @return
	 */
	public ArrayList<Book> findBookForReturn(String title);
	/**
	 * 책 대여하기 jtable을 선택한 값에서 매개변수 따올것 
	 * @param book_id
	 * @param user_id
	 * @return
	 */
	public int rentalBook(@Param("book_id") String book_id, @Param("user_id")String user_id);
	/**
	 * 반납할 책의 날짜 업데이트하기/ 선택한 값에서 bookrental_id 따올것 
	 * @param bookrental_id
	 * @return
	 */
	public int updateReceiveDate(String bookrental_id);
	/**
	 *  예약자 아이디 업데이트하기 
	 * @param bookrental_id
	 * @return
	 */
	public int updateReserve(@Param("bookrental_id")String bookrental_id, @Param("user_id")String user_id);
}
