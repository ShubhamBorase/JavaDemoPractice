
import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = 0;

		System.out.println("Enter The Number Of Rows");

		try{
			row = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int num = row+(row-1);
		int y = 0;

		for(int x = 0; x<row; ){
			if(y<=x){
				System.out.print(num+" ");
				num--;
				y++;
				continue;
			}
			System.out.println();
			x++;
			num = row+(row-1)-x;
			y = 0;
		}
	}
}