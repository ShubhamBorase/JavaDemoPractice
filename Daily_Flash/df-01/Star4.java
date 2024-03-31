
import java.io.*;

class Star4{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the no of Rows");

		int num = Integer.parseInt(br.readLine());
		int col=1;
		for (int row=1; row<=num; ){
			if (col<num){
				col++;
				System.out.print("*");
				continue;
			}else if (col==num){
				System.out.print("*");
				System.out.println();
				col=1;
				row++;
			}
		}
	}
}
