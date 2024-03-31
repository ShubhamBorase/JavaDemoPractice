

import java.util.*;

class EvenDivisible8{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lower Limit");
		int ll=sc.nextInt();
		System.out.println("Enter Upper Limit");
		int ul=sc.nextInt();
		System.out.println("Enter Divisor");
		int d=sc.nextInt();
		for (int i=ll; i<=ul; i++){
			if (i%d==0){
				if (i%2==0){
					System.out.print(i+", ");
				}
			}
		}
	}
}
