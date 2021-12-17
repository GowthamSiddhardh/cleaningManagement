import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PrivateMethod {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//	Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//		System.out.println("enter the mail1");
//		String s1=sc.nextLine();
//		System.out.println("enter the mail2");
//		String s2=sc.nextLine();
//		String [] details=s1.split(",");
//		String [] det=s2.split(",");
//		Mail ma=new Mail();
//		Mail maa=new Mail(Long.parseLong(det[0]),det[1],det[2],det[3],det[4],sdf.parse(det[5]),Double.parseDouble(det[6]));
//		ma.setType_id(Long.parseLong(details[0]));
//		ma.setTo(details[1]);
//		ma.setFrom(details[2]);
//		ma.setSubject(details[3]);
//		ma.setContent(details[4]);
//		ma.setReceived_date(sdf.parse(details[5]));
//		ma.setSize(Double.parseDouble(details[6]));
//		System.out.println(ma);
//		System.out.println(maa);
		Mail m3=new Mail(1001,"gowtham@gmail.com","siddharth@gmail.com","permission","mail",sdf.parse("05-04-2017"),14.56);
		System.out.println(m3);
	}

}