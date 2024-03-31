
import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Number Of Rows");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		char ch = 'A';

		int i = 0;

		for(int x = 0; x<num; ){
			if(i<(num-x)){
				System.out.print(ch+" ");
				ch+= 2;
				i++;
				continue;
			}
			System.out.println();
			x++;
			i = 0;
			ch = 'A';
			ch+= x;
		}
	}
}