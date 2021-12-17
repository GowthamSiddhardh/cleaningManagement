import java.util.Arrays;

public class StringChange {
	public static void main(String[] args) {
		int number = 8251;

		String s1 = String.valueOf(number);
		char[] ch = s1.toCharArray();
		int len = ch.length;
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		

		for (int k = 0; k < ch.length; k++) {
			System.out.print(ch[k]);
	
	
//		String s=Character.toString(a);
//		String s2=Character.toString(b);
//		String S=s.concat(s2);
//		System.out.println(S);
//		String str="08";
//		System.out.println(str);
//		int abc=Integer.parseInt(str);
//		System.out.println(abc);
	   
	    
	    
		
	}

	}
}
