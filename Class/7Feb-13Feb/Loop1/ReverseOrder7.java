

import java.util.*;

class ReverseOrder7{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upper limit for alternate no");
		int limitu=sc.nextInt();
		System.out.println("Enter Lower limit for alternate no");
		int limitl=sc.nextInt();
		
		for (int x=limitu; x>=limitl; x=x-2){
			System.out.print(x+", ");
		}
	}
}
