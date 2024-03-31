
import java.io.*;

class Pattern4{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Stream Connetion

		int num = 1;									// Initialising

		System.out.println("Enter the number of rows");
		try{
			num = Integer.parseInt(br.readLine());					//Taking Input
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();
			}catch(IOException io1){
				System.out.println("System Error");
			}
		}

		int col = 1;
		int count = 1;
		for(int row=1; row<num; ){
			if (col<num){
				System.out.print(count+" ");
				count++;
				col++;
				continue;
			}else if(col==num){
				System.out.print(count+" ");
				count++;
				System.out.println();
				col = 1;
				row++;
			}
		}
	}
}
