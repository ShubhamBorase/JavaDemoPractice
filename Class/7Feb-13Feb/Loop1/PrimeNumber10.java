

import java.util.*;

class PrimeNumber10{
	public static void main (String...args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Upper Limit");
		int ul=sc.nextInt();
		System.out.println("Enter The Lower Limit");
		int ll=sc.nextInt();

		for (int i=ll; i<=ul; i++){
			int x=0;
			for (int j=2; j<ul/2; j++){
				if(i%j==0){
					x++;
				}
			}
			if (x==1){
				System.out.print(i+" ");
			}
		}
	}
}
