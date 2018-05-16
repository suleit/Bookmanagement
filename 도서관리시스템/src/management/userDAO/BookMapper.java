package management.userDAO;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import management.vo.Book;
import management.vo.DBvo;
import management.vo.User;

public interface BookMapper {

	/**
	 * �뿩��� ���̺� ��ü�� ��� (���α׷� ���۽ø��� ����)
	 * @return
	 */
	public int updatehistoryOverdue();
	/**
	 * ��Ż���̺� ��ü�� ��� 
	 * @return
	 */
	public int updateOverdue();
	/**
	 *  �̿��� �˻�-�α��ν� ���
	 * @param id ���� string���� �޾Ƽ� �����
	 * @return
	 */
	public User findUser(String user_id);
	/**
	 * �űԵ�������
	 * @param book
	 * @return
	 */
	public int insertBook(Book book);
	/**
	 * �ش� ������ ���Ե� å���� ��Ȳ ���
	 * @param title (å����)
	 * @return
	 */
	public ArrayList<Book> findbook(String title);
	/**
	 * ���� ���� (�Ѽ� ��) å ���� 
	 * @param book
	 * @return
	 */
	public int deletebook(String book_id);
	/**
	 * ��� ���� ��Ȳ �˻��Ͽ� ��Ÿ���� 
	 * @return
	 */
	public ArrayList<Book> findAllbook();
	/**
	 * ���� �뿩���� ��� å���� ���� ��� (�ݳ��� �ȵ� å)
	 * @return
	 */
	public ArrayList<Book> findRentalBook();
	/**
	 * �̹ݳ��� ��ü������ å�� ��Ÿ���� (�뿩���� ������ ����)
	 * @return
	 */
	public ArrayList<DBvo> findOverdueBook();
	/**
	 * ����å �˻� - �̸����� 
	 * �����ڿ� �뿩�ڰ� �� ���ִ� ������ �˻��� �� �ǵ���/�ݳ��� null ������̵� null
	 * @param title
	 * @return
	 */
	public ArrayList<Book> findBookForRent(String title);
	/**
	 *  �ݳ��� å �˻�- �뿩�� �̸�����
	 *  �ݳ����� null�� �͸� �˻� 
	 * @param rental_name
	 * @return
	 */
	public ArrayList<Book> findBookForReturn(@Param("rental_name")String rental_name);
	/**
	 * å �뿩�ϱ� jtable�� ������ ������ �Ű����� ���ð� 
	 * @param book_id
	 * @param user_id
	 * @return
	 */
	public int rentalBook(@Param("book_id") String book_id, @Param("user_id")String user_id);
	/**
	 * å �뿩 ���  ���̺� �̷� ����� jtable�� ������ ������ �Ű����� ���ð� 
	 * @param book_id
	 * @param user_id
	 * @return
	 */
	public int rentalBookhistory(@Param("book_id") String book_id, @Param("user_id")String user_id);

	/**
	 * å�� �ݳ�����  �뿩��Ͽ� ������Ʈ�ϱ�/ ������ ������ bookrental_id ���ð� 
	 * @param bookrental_id
	 * @return
	 */
	public int updateReceiveDate(String bookrental_id);
	/**
	 * �뿩��� ���� 
	 * @param bookrental_id
	 * @return
	 */
	public int deleteBookRental(String bookrental_id);
	
	/**
	 *  rental���̺� ������ ���̵� ������Ʈ�ϱ� 
	 * @param bookrental_id
	 * @return
	 */
	public int updateReserve(@Param("bookrental_id")String bookrental_id, @Param("user_id")String user_id);
	/**
	 * rentalhistory ���̺� ������ ���̵� ������Ʈ�ϱ�
	 * @param bookrental_id
	 * @param user_id
	 * @return
	 */
	public int updateReserveHistory(@Param("bookrental_id")String bookrental_id, @Param("user_id")String user_id);
}
