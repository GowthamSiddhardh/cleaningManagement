
public class ThreeString {
  String s1;
  String s2;
  String s3;
public ThreeString(String s1, String s2, String s3) {
	super();
	this.s1 = s1;
	this.s2 = s2;
	this.s3 = s3;
}
  
  public String ConcateString()
  {  
	  String s4=s1.concat(s2).concat(s3);
	  return s4;
  }
  
}
