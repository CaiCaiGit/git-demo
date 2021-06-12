package Entity;
public class UserList {
	private int userId;
	private String username;
	
	private String usercard;
	private String userpw;
	private String userschool;
	private String userdec;
	private int usermo;
	
	public UserList() {
		super();
	}
	public UserList(int userId, String username, String usercard, String userpw, String userschool, String userdec,
			int usermo) {
		super();
		this.userId = userId;
		this.username = username;
		this.usercard = usercard;
		this.userpw = userpw;
		this.userschool = userschool;
		this.userdec = userdec;
		this.usermo = usermo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsercard() {
		return usercard;
	}
	public void setUsercard(String usercard) {
		this.usercard = usercard;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUserschool() {
		return userschool;
	}
	public void setUserschool(String userschool) {
		this.userschool = userschool;
	}
	public String getUserdec() {
		return userdec;
	}
	public void setUserdec(String userdec) {
		this.userdec = userdec;
	}
	public int getUsermo() {
		return usermo;
	}
	public void setUsermo(int usermo) {
		this.usermo = usermo;
	}
	
}
