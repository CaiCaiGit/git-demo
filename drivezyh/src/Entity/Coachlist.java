package Entity;

public class Coachlist {
	private int coachId;
	private String coachname;
	private String  coachcard;
	private String coachsex;
	private String  coachph;
	private String coachdec;
	private String coachcar;
	private String coachschool;
	private String coachmo;
	
	public Coachlist() {
		super();
	}
	public Coachlist(int coachId, String coachname, String coachcard, String coachsex, String coachph, String coachdec,
			String coachcar, String coachschool, String coachmo) {
		super();
		this.coachId = coachId;
		this.coachname = coachname;
		this.coachcard = coachcard;
		this.coachsex = coachsex;
		this.coachph = coachph;
		this.coachdec = coachdec;
		this.coachcar = coachcar;
		this.coachschool = coachschool;
		this.coachmo = coachmo;
	}
	public int getCoachId() {
		return coachId;
	}
	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	public String getCoachcard() {
		return coachcard;
	}
	public void setCoachcard(String coachcard) {
		this.coachcard = coachcard;
	}
	public String getCoachsex() {
		return coachsex;
	}
	public void setCoachsex(String coachsex) {
		this.coachsex = coachsex;
	}
	public String getCoachph() {
		return coachph;
	}
	public void setCoachph(String coachph) {
		this.coachph = coachph;
	}
	public String getCoachdec() {
		return coachdec;
	}
	public void setCoachdec(String coachdec) {
		this.coachdec = coachdec;
	}
	public String getCoachcar() {
		return coachcar;
	}
	public void setCoachcar(String coachcar) {
		this.coachcar = coachcar;
	}
	public String getCoachschool() {
		return coachschool;
	}
	public void setCoachschool(String coachschool) {
		this.coachschool = coachschool;
	}
	public String getCoachmo() {
		return coachmo;
	}
	public void setCoachmo(String coachmo) {
		this.coachmo = coachmo;
	}
	

}
