package management.vo;

import java.sql.Date;

public class Book {
	
	private String book_id; //pk, isbn ÀÌ¿כ
	private String title;
	private String Author;
	private String publisher;
	private String rental_id;
	private String reserve_id;
	private String rental_date;
	private String receive_date;
	private int overdue;
	
	public Book() {
		super();
	}
	
	public Book(String book_id, String title, String author, String publisher) {
		super();
		this.book_id = book_id;
		this.title = title;
		Author = author;
		this.publisher = publisher;
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
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getRental_id() {
		return rental_id;
	}
	public void setRental_id(String rental_id) {
		this.rental_id = rental_id;
	}
	public String getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(String reserve_id) {
		this.reserve_id = reserve_id;
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
	public int getOverdue() {
		return overdue;
	}
	public void setOverdue(int overdue) {
		this.overdue = overdue;
	}

	
}
