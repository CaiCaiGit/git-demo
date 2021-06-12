package Service;
import java.util.List;


import Entity.Admin;
public interface Adminservice {
	public Admin findByNaP(int adminId,String adminpw);
	
	public List<Admin> findalladmin();

}
