
import java.util.*;


class Automorphic7{
	public static void main(String...args){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter The Numbers Your Want To Check");
		int in=sc.nextInt();
		
		int x=in;
		int y=in*in;
		int sum1=0;
		int sum2=0;

		while (x!=0){
			int rem1=x%10;
			sum1=sum1*10+rem1;
			x=x/10;

			int rem2=y%10;
			sum2=sum2*10+rem2;
			y=y/10;
		}
		if (sum1==sum2){
			System.out.println(in+" is a Automorphic Number");
		}else
			System.out.println(in+" is not a Automorphic Number");
	}
}
