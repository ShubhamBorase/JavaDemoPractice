


import java.util.*;

class AdditionArray7{
	public static void main (String...args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Rows In Matrix");
		int row=sc.nextInt();
		System.out.println("Enter The Members Of Matrix");

		int [][] arr=new int [row][row];

		for (int y=0; y<row; y++){
			for (int z=0; z<row; z++){
				arr [y][z]=sc.nextInt();
			}
		}
	
		int sum=0;
		for (int y=0; y<row; y++){
			for (int z=0; z<row; z++){
				sum=sum+arr[y][z];
			}
		}
		System.out.println();
			System.out.print("Sum of Diagonals Of Array On Plane Is "+sum);
	}
}


