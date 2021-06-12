package Entity;

public class Orderlist {
	private int orderId;
	private String coachname;
	private String username;
	private String orderyear;
	private String ordermonth;
	private String orderday;
	private String ordertime;
	private String ordersec;
	private String orderadname;
	private String oktime;
	
	public Orderlist() {
		super();
	}
	public Orderlist(int orderId, String coachname, String username, String orderyear, String ordermonth,
			String orderday, String ordertime, String ordersec, String orderadname, String oktime) {
		super();
		this.orderId = orderId;
		this.coachname = coachname;
		this.username = username;
		this.orderyear = orderyear;
		this.ordermonth = ordermonth;
		this.orderday = orderday;
		this.ordertime = ordertime;
		this.ordersec = ordersec;
		this.orderadname = orderadname;
		this.oktime = oktime;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOrderyear() {
		return orderyear;
	}
	public void setOrderyear(String orderyear) {
		this.orderyear = orderyear;
	}
	public String getOrdermonth() {
		return ordermonth;
	}
	public void setOrdermonth(String ordermonth) {
		this.ordermonth = ordermonth;
	}
	public String getOrderday() {
		return orderday;
	}
	public void setOrderday(String orderday) {
		this.orderday = orderday;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getOrdersec() {
		return ordersec;
	}
	public void setOrdersec(String ordersec) {
		this.ordersec = ordersec;
	}
	public String getOrderadname() {
		return orderadname;
	}
	public void setOrderadname(String orderadname) {
		this.orderadname = orderadname;
	}
	public String getOktime() {
		return oktime;
	}
	public void setOktime(String oktime) {
		this.oktime = oktime;
	}

}
