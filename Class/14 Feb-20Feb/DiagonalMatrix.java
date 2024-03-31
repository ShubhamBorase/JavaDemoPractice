


import java.util.*;

class DiagonalMatrix{
	public static void main (String...args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number Of Rows In Matrix");
		int row=sc.nextInt();
		System.out.println("Enter The Matrix Members");

		int [][] arr=new int [row][row];
		
		for (int i=0; i<row; i++){
			for (int j=0; j<row; j++){
				arr [i][j]=sc.nextInt();
			}
		}

		for (int i=0; i<row; i++){
			int z=row;
			for (int j=0; j<row; j++){
				if (i==j){
                                        arr[i][j]=0;
                                }
				if ((i+j+1)==z){
					arr[i][j]=0;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
