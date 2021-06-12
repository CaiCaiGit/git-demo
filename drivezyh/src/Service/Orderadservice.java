package Service;

import java.util.List;

import Entity.Orderadlist;

public interface Orderadservice {
	public List<Orderadlist> findall();
	public Orderadlist  findByorderadId(int orderadId);
}
