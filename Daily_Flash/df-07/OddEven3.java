
import java.io.*;

class OddEven3{
	public static void main(String...args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		System.out.println("Enter The Number to check for Odd or Even");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		if(num%2==0){
			System.out.println(num+" is a Even Number");
		}else if(num%2==1){
			System.out.println(num+" is a Odd Number");
		}
	}
}
