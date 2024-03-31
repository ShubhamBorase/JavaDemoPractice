
import java.util.*;


class RangeReverse10{
	public static void main (String...args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Lower Limit Of The Range");
		int x=sc.nextInt();
		System.out.println("Enter The Upper Limit Of The Range");
		int y=sc.nextInt();

		for (int i=x; i<=y; i++){
			int j=i;
			int sum=0;
			while (j!=0){
				int rem=j%10;
				sum=sum*10+rem;
				j=j/10;
			}
			System.out.print(sum+" | ");
		}
	}
}
