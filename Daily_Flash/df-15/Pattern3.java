
import java.io.*;

class Pattern3{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch = 'A';
		int row = 0;

		System.out.println("Enter The Number Of Rows You Want");

		try{
			row = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int y = 0;

		for (int x = 0; x<row; ){
			if(y<(row-x)){
				System.out.print(ch+" ");
				y++;
				continue;
			}
			System.out.println();
			y = 0;
			x++;
			ch++;
		}
	}
}