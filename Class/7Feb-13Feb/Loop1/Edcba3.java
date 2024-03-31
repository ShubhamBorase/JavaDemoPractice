


import java.util.*;


class Edcba3{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of rows you want");
		int row=sc.nextInt();
		for (int i=1; i<=row; i++){
			char ch=69;
			for (int col=1; col<=row; col++){
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}
