package Service.impl;

import java.util.List;

import Dao.Userdao;
import Dao.impl.Userdaoimpl;
import Entity.UserList;
import Service.Userservice;

public class Userserviceimpl implements Userservice {
	private Userdao Userdao = new Userdaoimpl();
	@Override
	public List<UserList> findall() {
		return Userdao.findall();
	}

	@Override
	public void deleteByUserId(int userId) {
		Userdao.deleteByUserId(userId);
	}

	@Override
	public void addUser(UserList userlist) {
		Userdao.addUser(userlist);
	}

	@Override
	public void updateUser(UserList userList) {
		Userdao.updateUser(userList);
	}
	@Override
	public UserList finduserbyid(int userId) {
		return Userdao.finduserbyid(userId);
	}

	@Override
	public UserList finduserbycard(String usercard) {
		return Userdao.finduserbycard(usercard);
	}

}
