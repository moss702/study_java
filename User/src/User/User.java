package User;

public abstract class User {
	String id;
	String name;
	String pw;
	public User(String id, String name, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pw=" + pw + "]";
	}
	
	
	
}
