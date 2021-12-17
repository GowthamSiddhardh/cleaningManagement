package order;

public class products {
     private int id;
     private String name;
     private String desc;
     private double stancost;
     private double localcost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getStancost() {
		return stancost;
	}
	public void setStancost(double stancost) {
		this.stancost = stancost;
	}
	public double getLocalcost() {
		return localcost;
	}
	public void setLocalcost(double localcost) {
		this.localcost = localcost;
	}
	public products(int id, String name, String desc, double stancost, double localcost) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.stancost = stancost;
		this.localcost = localcost;
	}
	public products() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
