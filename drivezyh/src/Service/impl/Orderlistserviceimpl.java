package Service.impl;

import java.util.List;

import Dao.Orderlistdao;
import Dao.impl.Orderlistdaoimpl;
import Entity.Orderlist;
import Service.Orderlistservice;

public class Orderlistserviceimpl implements Orderlistservice {
	private Orderlistdao Orderlistdao=new Orderlistdaoimpl();
	public List<Orderlist> findall() {
		return Orderlistdao.findall();
	}

	public void deletebyorderId(int orderId) {
		Orderlistdao.deletebyorderId(orderId);
	}

	@Override
	public Orderlist findbycoachId(int coachId) {
		return Orderlistdao.findbycoachId(coachId);
	}

	@Override
	public Orderlist findbyuserId(int userId) {
		return Orderlistdao.findbyuserId(userId);
	}

	@Override
	public Orderlist findbyorderym(int orderym) {
		return Orderlistdao.findbyorderym(orderym);
	}

}
