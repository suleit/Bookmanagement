package management.vo;

import java.sql.Date;

public class Book {
	
	private String book_id; //pk, isbn ÀÌ¿כ
	private String title;
	private String publisher;
	private User rental_User;
	private User reserve_User;
	private String rental_date;
	private String receive_date;
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

	public User getRental_User() {
		return rental_User;
	}

	public void setRental_User(User rental_User) {
		this.rental_User = rental_User;
	}

	public User getReserve_User() {
		return reserve_User;
	}

	public void setReserve_User(User reserve_User) {
		this.reserve_User = reserve_User;
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