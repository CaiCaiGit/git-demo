package Service;

import java.util.List;

import Entity.Coachlist;

public interface Coachservice {
	public List<Coachlist> findall();
	public void deleteBycoachId(int coachId);
	public void addcoach(Coachlist coachlist);
	public void updatecoach(Coachlist coachlist);
	public Coachlist findcoachbyid(int coachId);
}
