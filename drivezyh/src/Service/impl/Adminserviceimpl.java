package Service.impl;

import java.util.List;

import Dao.Admindao;
import Dao.impl.Admindaoimpl;
import Entity.Admin;
import Service.Adminservice;

public class Adminserviceimpl implements Adminservice {
	//根据用户名和密码查询
	private Admindao admindao =new Admindaoimpl();
	@Override
	public Admin findByNaP(int adminId, String adminpw) {
		return admindao.findByNaP(adminId, adminpw);
	}
	
	@Override
	public List<Admin> findalladmin() {
		return admindao.findalladmin();
	}

}
