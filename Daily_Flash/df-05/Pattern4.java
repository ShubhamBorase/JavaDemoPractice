
import java.io.*;

class Pattern4{
	public static void main(String...args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Input Stream

		int num = 1;									//Initialisation
		int count = 2;
		int col =1;

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();
			}catch(IOException io1){
				System.out.println("System Error");
			}
		}

		int num2 = num+(num-1);
		for(int row = 1; row<=num; ){
			if((col<num) && (row==1)){
				System.out.print(count+" ");
				count = count+2;
				col++;
				continue;
			}else if((col==num) && (row==1)){
				System.out.print(count+" ");
				count = 2;
				System.out.println();
				col = 1;
				row++;
			}else if((col<num) && (row>1)){
				System.out.print("  ");
				col++;
				continue;
			}else if((col<num2) && (col>=num)){
				System.out.print(count+" ");
				count = count+2;
				col++;
				continue;
			}else if((col==num2) && (col>=num)){
				System.out.print(count+" ");
				System.out.println();
				count = 2;
				col = 1;
				row++;
			}
		}
	}
}
