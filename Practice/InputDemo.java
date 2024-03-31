import java.io.*;

class InputDemo{
	public static void main(String...args)throws IOException{

		char ch = 97;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		for (int i = 0; i<x; i++){
			for (int j = 0; j<x; j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
