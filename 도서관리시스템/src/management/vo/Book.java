package management.vo;

import java.sql.Date;

public class Book {
	
	private String bookrental_id; // rental table pk;
	private String book_id; //pk, isbn ÀÌ¿כ
	private String title;
	private String publisher;
	private String rental_date;
	private String receive_date;
	private String rental_name;
	private String reserve_name;
	private int overdue;
	
	public Book() {
		super();
	}
	
	public Book(String book_id, String title, String publisher) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.publisher = publisher;
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

	public String getReceive_date() {
		return receive_date;
	}

	public void setReceive_date(String receive_date) {
		this.receive_date = receive_date;
	}

	public String getRental_name() {
		return rental_name;
	}

	public void setRental_name(String rental_name) {
		this.rental_name = rental_name;
	}

	public String getReserve_name() {
		return reserve_name;
	}

	public void setReserve_name(String reserve_name) {
		this.reserve_name = reserve_name;
	}

	public int getOverdue() {
		return overdue;
	}

	public void setOverdue(int overdue) {
		this.overdue = overdue;
	}
	
	
	
	
	
}
