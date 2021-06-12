package Service.impl;

import Dao.Orderfdao;
import Dao.impl.Orderfdaoimpl;
import Entity.Orderlist;
import Service.Orderfservice;

public class Orderfserviceimpl implements Orderfservice {
	private Orderfdao Orderfdao =new Orderfdaoimpl();
	@Override
	public void addorderf(Orderlist Orderlist) {
		Orderfdao.addorderf(Orderlist);
	}

}
