

import java.util.*;

class UserArray2{
	public static void main (String...args){
		
		Scanner sc = new Scanner (System.in);

		int [] x = new int [5];
		
		for (int i=0; i<5; i++){
			x[i]=sc.nextInt();
		}

		for (int i=0; i<5; i++){
			System.out.print(x[i]);
		}
	}
}
