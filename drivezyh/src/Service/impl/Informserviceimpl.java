package Service.impl;

import java.util.List;

import Dao.Informdao;
import Dao.impl.Informdaoimpl;
import Entity.Inform;
import Service.Informservice;

public class Informserviceimpl implements Informservice {
	private Informdao informdao = new Informdaoimpl();
	@Override
	public List<Inform> findall() {
		return informdao.findall();
	}

	@Override
	public void deleteByInformId(int Informid) {
		informdao.deleteByInformId(Informid);
	}

	@Override
	public void addInform(Inform inform) {
		informdao.addInform(inform);
	}

	@Override
	public void updateInform(Inform inform) {
		informdao.updateInform(inform);
	}

	@Override
	public Inform findInformbyId(int Informid) {
		return informdao.findInformbyId(Informid);
	}

}
