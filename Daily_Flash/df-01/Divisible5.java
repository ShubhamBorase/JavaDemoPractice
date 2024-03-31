

import java.io.*;

class Divisible5{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number to check if it is divisible by 5 and 11 or not");

		int num = Integer.parseInt(br.readLine());

		if (num%5==0 && num%11==0){
			System.out.println("The Number is divisible by both 5 and 11");
		}else if (num%5==0){
			System.out.println("The Number is divisible by 5 only");
		}else if (num%11==0){
                        System.out.println("The Number is divisible by 11 only");
                }else
			System.out.println("The Number is not divisible by 5 as well as 11");
	}
}
