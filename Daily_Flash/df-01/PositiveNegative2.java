
import java.io.*;

class PositiveNegative2{
	public static void main(String...args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Numbers");
		
		int num1 = Integer.parseInt(br.readLine());

		if (num1<0){
			System.out.println("The Number "+num1+" is a Negative Number");
		}else if (num1>0){
			System.out.println("The Number "+num1+" is a Positive Number");
		}else
			System.out.println("The Number "+num1+" is Neutral");
	}
}
