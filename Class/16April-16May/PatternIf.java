import java.io.*;

class PatternIf{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());

		int j = 1;
		for(int i = 1; i<=row; ){
			if(j<=i){
				System.out.print("* ");
				j++;
				continue;
			}
			j = 1;
			i++;
			System.out.println();
		}
	}
}
