package Service.impl;

import java.util.List;

import Dao.Orderaddao;
import Dao.impl.Orderaddaoimpl;
import Entity.Orderadlist;
import Service.Orderadservice;

public class Orderadserviceimpl implements Orderadservice {
	private Orderaddao Orderaddao=new Orderaddaoimpl();
	@Override
	public List<Orderadlist> findall() {
		return Orderaddao.findall();
	}

	@Override
	public Orderadlist findByorderadId(int orderadId) {
		return Orderaddao.findByorderadId(orderadId);
	}

}
