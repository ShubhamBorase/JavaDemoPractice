import java.io.*;

class Pattern3{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch = 'a';
		int end = 0;

		System.out.println("Enter Number Of Rows");

		try{
			end = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int j = 0;

		for(int i = 0; i<end; ){
			if(j<(end-i)){
				System.out.print(" "+ch++);
				j++;
				continue;
			}
			System.out.println();
			ch--;
			i++;
			j = 0;
		}
	}
}