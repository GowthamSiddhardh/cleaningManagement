import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Lsm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("gowtham");
		list.add("mani");
		list.add("munish");
		list.add("pp");
		list.add(23);
		Object o=list.get(0);
		list.set(0,list.get(1));
		list.set(1,o );
		list.remove(3);
		list.set(3, "fghjkl;");
		System.out.println(list.indexOf("munish"));
		
		System.out.println(list);
		
		Set s1=new TreeSet();
		s1.add("gowtham");
		s1.add("siddharth");
		
		System.out.println(s1);
		

	}

}
