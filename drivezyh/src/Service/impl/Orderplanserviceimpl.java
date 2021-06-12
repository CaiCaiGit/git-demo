package Service.impl;

import java.util.List;

import Dao.Orderplandao;
import Dao.impl.Orderplandaoimpl;
import Entity.Orderplanlist;
import Service.Orderplanservice;

public class Orderplanserviceimpl implements Orderplanservice {
	private Orderplandao Orderplandao =new Orderplandaoimpl();
	public List<Orderplanlist> findall() {
		return Orderplandao.findall();
	}

	public void deleteorderplanId(int orderplanId) {
		Orderplandao.deleteorderplanId(orderplanId);
	}

	public void addorderplan(Orderplanlist orderplanlist) {
		Orderplandao.addorderplan(orderplanlist);
	}

	public void updateorderplan(Orderplanlist orderplanlist) {
		Orderplandao.updateorderplan(orderplanlist);
	}

	public Orderplanlist finduserbyid(int orderplanId) {
		return Orderplandao.finduserbyid(orderplanId);
	}

}
