package Dao;

import java.util.List;

import Entity.Page;
import Entity.UserList;

public interface Userpage {
	public int getuser() ;
	public List<UserList> findbypage(Page page);
}
