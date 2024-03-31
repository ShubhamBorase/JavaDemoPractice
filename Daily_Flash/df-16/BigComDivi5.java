/*
Write a Program that calculates the Greatest Common Divisor of two
entered numbers. Input: 25 15 Output: The GCD of 25 & 15 is 5.
*/

import java.io.*;

class BigComDivi5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0;
		int num2 = 0;

		System.out.println("Enter The Two Numbers");

		try{
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int count  = 1;
		for(int x = 1; x<=num1 && x<=num2; x++){
			if((num1%x==0)&&(num2%x==0)){
				count = x;
			}
		}

		System.out.println("The Greatest Common Divisor of "+num1+" and "+num2+" is "+count);
	}
}