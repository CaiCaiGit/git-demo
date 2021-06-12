package Service.impl;

import java.util.List;

import Dao.Userpage;
import Dao.impl.Userpageimpl;
import Entity.Page;
import Entity.UserList;
import Service.Userpageservice;

public class Userpageservletimpl implements Userpageservice {

	private Userpage userpage=new Userpageimpl();
	@Override
	public int getuser() {
		return userpage.getuser();
	}

	@Override
	public List<UserList> findbypage(Page page) {
		return userpage.findbypage(page);
	}

}
