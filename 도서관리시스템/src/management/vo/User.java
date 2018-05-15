package management.vo;

public class User {
	
	private String user_id; // pk
	private String user_pw;
	private String name;
	private String gisu;
	private String classname;
	
	public User() {
		super();
	}
	
	
	public User(String user_id, String user_pw, String name, String gisu, String classname) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.name = name;
		this.gisu = gisu;
		this.classname = classname;
	}


	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_pw=" + user_pw + ", name=" + name + ", gisu=" + gisu
				+ ", classname=" + classname + "]";
	}
	
	

}
