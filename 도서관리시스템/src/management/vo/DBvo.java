package management.vo;

public class DBvo {
/*
 * 연체자 정보 출력시 사용 
 * */
	private String bookrental_id; // rental table pk;
	private String book_id; //pk, isbn 이용
	private String title;
	private String publisher;
	private String rental_date;
	private String rental_name;
	private String rental_id;
	private String gisu;
	private String classname;
	private int overdue;
	
	public DBvo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getBookrental_id() {
		return bookrental_id;
	}
	public void setBookrental_id(String bookrental_id) {
		this.bookrental_id = bookrental_id;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getRental_date() {
		return rental_date;
	}
	public void setRental_date(String rental_date) {
		this.rental_date = rental_date;
	}
	public String getRental_name() {
		return rental_name;
	}
	public void setRental_name(String rental_name) {
		this.rental_name = rental_name;
	}
	public String getRental_id() {
		return rental_id;
	}
	public void setRental_id(String rental_id) {
		this.rental_id = rental_id;
	}
	public String getGisu() {
		return gisu;
	}
	public void setGisu(String gisu) {
		this.gisu = gisu;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getOverdue() {
		return overdue;
	}
	public void setOverdue(int overdue) {
		this.overdue = overdue;
	}

	@Override
	public String toString() {
		return "DBvo [bookrental_id=" + bookrental_id + ", book_id=" + book_id + ", title=" + title + ", publisher="
				+ publisher + ", rental_date=" + rental_date + ", rental_name=" + rental_name + ", rental_id="
				+ rental_id + ", gisu=" + gisu + ", classname=" + classname + ", overdue=" + overdue + "]";
	}
	
	public String printBookInfo() {
		return book_id+", "+title+", "+publisher;
	}
	
	
	
}
