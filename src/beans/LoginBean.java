package beans;

public class LoginBean {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//method to validate the username and password
	public boolean isValidUser() {
		//validation can happen here from various sources, like a database
		return "admin".equals(this.userName) && "admin".equals(this.password);
	}
}
