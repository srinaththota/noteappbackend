package loginservice.user;

public class User {

	private int id;
	private String username;
	private String passwd;
	
	User(int id,String username,String password){
		this.username=username;
		this.setPasswd(password);
		this.setId(id);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
