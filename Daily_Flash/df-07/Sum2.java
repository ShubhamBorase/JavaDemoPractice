
import java.io.*;

class Sum2{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter the number to which you want to perform addition");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		int sum = 0;
		for(int i = 0; i<=num; i++){
			sum = sum+i;
		}

		System.out.println(sum);
	}
}
