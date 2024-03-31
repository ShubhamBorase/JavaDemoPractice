
import java.io.*;

class NumPattern4{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//creating stream

		int num = 4;									//declaration 
		System.out.println("Enter the Number of Rows");

		try{
			num = Integer.parseInt(br.readLine());					//input for rows
		}catch(IOException io){
			System.out.println("System Error");
		}

		int col = 1;
		System.out.println(num);
		for (int row=1; row<=num; ){
			if(col<num){
				System.out.print(col+" ");
				col++;
				continue;
			}else if (col==num){
				System.out.print(col+" ");
				System.out.println();
				col = 1;
				row++;
			}
		}
	}
}
