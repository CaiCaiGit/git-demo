package Service;

import java.util.List;

import Entity.Page;
import Entity.UserList;

public interface Userpageservice {
	public int getuser() ;
	public List<UserList> findbypage(Page page);
}
