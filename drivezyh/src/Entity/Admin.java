package Entity;

public class Admin {
	private int adminId;
	private String adminname;
	private String adminpw;
	
	public Admin() {
		super();
	}
	public Admin(int adminId, String adminname, String adminpw) {
		super();
		this.adminId = adminId;
		this.adminname = adminname;
		this.adminpw = adminpw;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpw() {
		return adminpw;
	}
	public void setAdminpw(String adminpw) {
		this.adminpw = adminpw;
	}
}
