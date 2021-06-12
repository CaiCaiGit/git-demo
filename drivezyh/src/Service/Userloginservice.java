package Service;

import java.util.List;

import Entity.UserList;

public interface Userloginservice {
	public UserList findBycap(String usercard,String userpw);
	public List<UserList> findalluser();
}
