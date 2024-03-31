
import java.io.*;

class Pattern5{
	public static void main(String...args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		System.out.println("Enter Number of Rows");
		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		int col = 1;
		for(int row=1; row<=num; ){
			if(col<num){
				if(row%2==1){
					System.out.print("0 ");
				}else
					System.out.print("1 ");
				col++;
			}else if(col==num){
				if(row%2==1){
					System.out.print("0 ");
				}else
					System.out.print("1 ");
				
				System.out.println();
				col = 1;
				row++;
			}
		}
	}
}
