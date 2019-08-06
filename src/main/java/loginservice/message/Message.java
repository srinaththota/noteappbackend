package loginservice.message;

public class Message {
	
	private String category;
	private int userId;
	private String message;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Message(int userId,String category,  String message) {
		super();
		this.category = category;
		this.userId = userId;
		this.message = message;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Message msg=(Message)obj;
		if(msg.getMessage()==this.message) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Message() {
		super();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.message.hashCode();
	}
	
	

}
