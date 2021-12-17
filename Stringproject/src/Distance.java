
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=3,x2=4;
		int y1=4,y2=6;
		int r1=4,r2=5;
		int r3=r1+r2;
		double d1,d2;
		d1=((x2-x1)*(x2-x1));
		d2=((y2-y1)*(y2-y1));
		//System.out.println(d1);
		//System.out.println(d2);
		
		double d3=Math.sqrt(d2+d1);
		System.out.println("distance between the centers of the 2bangles ="+" "+ d3);
		
		double D=d3-r3;
		//System.out.println(D);
		if(D>0)
		{
			System.out.println("do not touch");
		}
		else if(D==0)
		{
			System.out.println("touch");
		}
		else
		{
			System.out.println("intersect");
		}
		
		

	}

}
