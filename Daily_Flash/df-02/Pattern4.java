


import java.io.*;

class Pattern4{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//taking input

		System.out.println("Enter the no of Rows");

		int num = Integer.parseInt(br.readLine());
		int col=1;
		for (int row=1; row<=num; ){							//for loop for number of row
			if (col<num){
				col++;								//increase in column
				System.out.print("1 ");
				continue;
			}else if (col==num){
				System.out.print("1 ");
				System.out.println();						// blank for changing line
				col=1;
				row++;
			}
		}
	}
}
