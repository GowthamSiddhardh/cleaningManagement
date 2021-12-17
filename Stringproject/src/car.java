
public abstract class car {
   private int noOfWheels;
   private String type;
public int getNoOfWheels() {
	return noOfWheels;
}
public void setNoOfWheels(int noOfWheels) {
	this.noOfWheels = noOfWheels;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public car() {
	super();
	// TODO Auto-generated constructor stub
}
public car(int noOfWheels, String type) {
	super();
	this.noOfWheels = noOfWheels;
	this.type = type;
}
   public void ShowOf() {
	   System.out.println("this is parent class");
   }
   public abstract void Test();
   
   public abstract void test1();
  
}
