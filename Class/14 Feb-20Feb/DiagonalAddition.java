

import java.util.*;

class DiagonalAddition{
	public static void main (String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number Of Planes In Matrix");
		int plane=sc.nextInt();
		System.out.println("Enter The Number Of Rows In Matrix");
		int row=sc.nextInt();
		System.out.println("Enter The Members Of Matrix");

		int [][][] arr=new int [plane][row][row];
		
		for (int x=0; x<plane; x++){
			for (int y=0; y<row; y++){
				for (int z=0; z<row; z++){
					arr [x][y][z]=sc.nextInt();
				}
			}
		}

		for (int x=0; x<plane; x++){
			int sum=0;
			for (int y=0; y<row; y++){
				for (int z=0; z<row; z++){
					if (y==z){
					sum=sum+arr[x][y][z];
					}
				}
				System.out.println();
			}
			System.out.print("Sum of Diagonals Of Array On Plane Is "+sum);
		}
	}
}

