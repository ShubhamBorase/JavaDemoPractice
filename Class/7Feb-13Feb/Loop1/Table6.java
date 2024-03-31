


import java.util.*;

class Table6{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for Table");
		int r=sc.nextInt();

		for (int row=r; row>=1; row--){
			for (int col=1; col<=10; col++){
				System.out.print(row*col+" ");
			}
			System.out.println();
		}
	}
}
