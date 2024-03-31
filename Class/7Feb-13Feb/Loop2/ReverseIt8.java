

import java.util.*;


class ReverseIt8{
	public static void main(String...args){

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter The Number To reverse It");
		int in=sc.nextInt();
		int sum=0;
		while(in!=0){
			int rem=in%10;
			sum=sum*10+rem;
			in=in/10;
		}
		System.out.println(" "+sum);
	}
}
