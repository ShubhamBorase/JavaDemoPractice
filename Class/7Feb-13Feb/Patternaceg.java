


import java.util.*;

class PatternAceg{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit");
		int limit=sc.nextInt();
		char ch=97;
		for (int row=1; row<=limit; row++){
			for (int col=1; col<=limit; col++){
				System.out.print(ch+" ");
				ch+=2;
			}
			System.out.println();
		}
	}
}
