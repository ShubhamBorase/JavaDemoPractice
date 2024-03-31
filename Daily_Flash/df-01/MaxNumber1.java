
import java.io.*;

class MaxNumber1{
	public static void main(String...args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two numbers respectively to compare");

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		if (num1 < num2){
			System.out.println(num2+" is Greater");
		}else if (num1 > num2){
			System.out.println(num1+" is Greater");
		}else
			System.out.println("Both "+num1+" and "+num2+" are Equal");
	}
}
