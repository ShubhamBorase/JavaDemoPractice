
import java.io.*;

class Buffered1{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Value You Want To Print");
		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		System.out.println(num);
	}
}
