package Service.impl;

import java.util.List;

import Dao.Userlogindao;
import Dao.impl.Userlogindaoimpl;
import Entity.UserList;
import Service.Userloginservice;

public class Userloginserviceimpl implements Userloginservice {
	private Userlogindao Userlogindao=new Userlogindaoimpl();
	@Override
	public UserList findBycap(String usercard, String userpw) {
		return Userlogindao.findBycap(usercard, userpw);
	}

	public List<UserList> findalluser() {
		return Userlogindao.findalluser();
	}

}
