import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in = 1;

		System.out.println("Enter the number of rows");

		try{
			in = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		int count = 1;

		int col = 1;
		
		for(int row = 1; row<=in; ){
			if(col<row){
				System.out.print(count*count+" ");
				count++;
				col++;
				continue;
			}else if(col==row){
				System.out.print(count*count+" ");
				System.out.println();
				count++;
				col = 1;
				row++;
			}
		}
	}
}