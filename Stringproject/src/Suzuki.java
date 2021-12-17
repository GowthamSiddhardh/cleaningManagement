
public class Suzuki extends car {
     private Double topSpeed;

	public Double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Suzuki(int noOfWheels,String type,Double topSpeed) {
		super(noOfWheels,type);
		this.topSpeed = topSpeed;
	}

	public Suzuki() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void ShowOf() {
		System.out.println("this is child class");
	}

	
	@Override
	public void Test() {
		System.out.println("test pass");
		
	}

	@Override
	public void test1() {
	   System.out.println("test passed");
		
	}
	
}
