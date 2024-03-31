
import java.io.*;

class AnyTable4{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Number");
		
		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("Error");
		}

		for(int row = 1; row<=10; row++){
			System.out.print(num*row+" ");
		}
	}
}
