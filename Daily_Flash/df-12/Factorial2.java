/*Write a Program that accepts Two integers from the user and
prints the series of factorials of all numbers between those two inputs.
*/

import java.io.*;

class Factorial2{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0;
		int num2 = 0;

		System.out.println("Enter The Start and End of The Range of numbers Respectively");
		
		try{
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Stream breaked");
		}

		int x = 1;
		int digit = 1;
		int count = 1;

		for(x=num1; x<=num2; ){
			if(digit>1){
				count = count*digit;
				digit = digit-1;
				continue;
			}else if((digit==1)&&(x!=2)){
				count = count*digit;
				System.out.println("Factorial of "+x+" is "+count);
				count = 1;
				x++;
				digit = x;
			}else if((digit==1)&&(x==2)){
				count = 2*digit;
				System.out.println("Factorial of "+x+" is "+count);
				count = 1;
				x++;
				digit = x;
			}
		}
	}
}