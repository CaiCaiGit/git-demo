package Service.impl;

import java.util.List;

import Dao.Coachdao;
import Dao.impl.Coachdaoimpl;
import Entity.Coachlist;
import Service.Coachservice;

public class Coachserviceimpl implements Coachservice {
	private Coachdao Coachdao=new Coachdaoimpl();
	@Override
	public List<Coachlist> findall() {
		return  Coachdao.findall();
	}

	@Override
	public void deleteBycoachId(int coachId) {
		Coachdao.deleteBycoachId(coachId);
	}

	@Override
	public void addcoach(Coachlist coachlist) {
		Coachdao.addcoach(coachlist);
	}

	@Override
	public void updatecoach(Coachlist coachlist) {
		Coachdao.updatecoach(coachlist);
	}

	@Override
	public Coachlist findcoachbyid(int coachId) {
		return Coachdao.findcoachbyid(coachId);
	}

}
