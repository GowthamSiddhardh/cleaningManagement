
public class StudentData {
	private int tamil;
	private int english;
	private int maths;
	private int social;
	private int science;

	public int getTamil() {
		return tamil;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	int sum() {
		int total=getScience()+getSocial()+getMaths()+getEnglish()+getTamil();
		
		return total;
		
		
	}
		


}
