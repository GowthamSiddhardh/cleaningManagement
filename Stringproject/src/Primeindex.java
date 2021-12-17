
public class Primeindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,8,10,6,4,77,5,3};
//	int n=73	;
//	int flag=1;
//			if(n==0 && n==1) {
//				System.out.println("not a prime");
//				flag=1;
//			}
//			else {
//				for(int i=2;i<n/2;i++) {
//					if(n%i!=0) {
//						flag=0;
//						break;
//					}
//					else
//					{
//						flag=1;
//					}
//				}
//			}
//			if(flag==0)
//			{
//				System.out.println("prime");
//			}
//			else if(flag==1)
//			{
//				System.out.println("not prime");
//			}
//		
		int total=0;
		int flag=1,i,j;
		
		for( i=1;i<arr.length;i++) 
		{
			flag=1;
		for( j=1;j<i/2;j++)
		{
			if(i%j==0)
			{
				flag=0;
			}
			
		}
		//System.out.println("flag-    "+flag);
		if(flag!=0) {
			System.out.println(arr[i]);
			 total+=arr[i];	
			 
		}
	
		
     
	} 
		System.out.println(total);

}
}
