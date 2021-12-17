
public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData sd=new StudentData();
		sd.setEnglish(88);
		sd.setMaths(98);
		sd.setScience(100);
		sd.setSocial(100);
		sd.setTamil(96);
		int result=sd.sum();
		System.out.println(result);

	}

}
