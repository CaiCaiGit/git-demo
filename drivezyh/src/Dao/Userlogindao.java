package Dao;

import java.util.List;

import Entity.UserList;



public interface Userlogindao {
	public UserList findBycap(String usercard,String userpw);
	public List<UserList> findalluser();
}
