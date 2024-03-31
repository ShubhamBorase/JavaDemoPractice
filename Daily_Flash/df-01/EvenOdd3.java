

import java.io.*;

class EvenOdd3{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number to check if its Even or Odd");
		int num = Integer.parseInt(br.readLine());

		if (num%2==0){
			System.out.println(" The Number "+num+" is Even Number");
		}else
			System.out.println("The Number "+num+" is Odd Number");
	}
} 
