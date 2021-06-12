package Service.impl;

import java.util.List;

import Dao.Ordertimedao;
import Dao.impl.Ordertimedaoimpl;
import Entity.Ordertimelist;
import Service.Ordertimeservice;

public class Ordertimeserviceimpl implements Ordertimeservice {
	private Ordertimedao Ordertimedao =new Ordertimedaoimpl();
	public List<Ordertimelist> findall() {
		return Ordertimedao.findall() ;
	}

	@Override
	public Ordertimelist findByordertimeId(int ordertimeId) {
		return  Ordertimedao.findByordertimeId(ordertimeId);
	}

}
