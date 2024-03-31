import java.io.*;

class Pattern5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = 0;

		System.out.println("Enter The Number Of Rows");

		try{
			row = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = 0; i<row; i++){
			
			int temp = row-i;
			
			for(int j = 0; j<row-1-i; j++){
				System.out.print("  ");
			}

			for(int j = 0; j<i+1; j++){
				System.out.print(temp+++" ");
			}

			System.out.println();
		}
	}
}