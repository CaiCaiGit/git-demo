package Dao;

import java.util.List;

import Entity.UserList;

public interface Userdao {
	public List<UserList> findall();
	public void deleteByUserId(int userId);
	public void addUser(UserList userlist);
	public void updateUser(UserList userList);
	public UserList finduserbyid(int userId);
	public UserList finduserbycard(String usercard);
}
