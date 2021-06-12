package Entity;

public class Orderadlist {
	private int orderadId;
	private String orderadname;
	
	public Orderadlist() {
		super();
	}
	public Orderadlist(int orderadId, String orderadname) {
		super();
		this.orderadId = orderadId;
		this.orderadname = orderadname;
	}
	public int getOrderadId() {
		return orderadId;
	}
	public void setOrderadId(int orderadId) {
		this.orderadId = orderadId;
	}
	public String getOrderadname() {
		return orderadname;
	}
	public void setOrderadname(String orderadname) {
		this.orderadname = orderadname;
	}
	
}
