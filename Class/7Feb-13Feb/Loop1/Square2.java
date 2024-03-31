


import java.util.*;

class Square2{
	public static void main (String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No of rows you want");
		int x=sc.nextInt();
		int y=1;
		for (int row=1; row<=x; row++){
			for (int col=1; col<=x; col++){
				if (col%2==0){
					System.out.print(y++ + " ");
				}else{
					System.out.print(y*y + " ");
					y++;
				}
			}
			System.out.println();
		}
	}
}
