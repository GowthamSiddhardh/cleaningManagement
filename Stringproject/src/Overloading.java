
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,8,10,15};
		Overloading.find(23, 45);
		Overloading.find(23, 45,67);
		Overloading.find(arr);
		
		
		

	}
	 public static void find(int a,int b)
	 {   
		 System.out.println((a>b)?a:b);
		 
		 
	 }
	 public static void find(int a,int b,int c)
	 {
		 System.out.println((a>b)&&(a>c)?a:(b>c)?b:c);
	 }
	 public static void find(int[] arr)
	 {   int max=0;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i]>max)
	    	 {
	    		 max=arr[i];
	    	 }
	     }
	     System.out.println(max);
	 }

}
