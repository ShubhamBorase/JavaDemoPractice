

import java.util.*;

class Pattern4{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("No of Rows you want");
		int row=sc.nextInt();
		for (int x=1; x<=row; x++){
			for (int col=1; col<=x; col++){
				if (col%2==0){
					System.out.print("0 ");
				}else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
