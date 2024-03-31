/*
Write a Program to Convert entered Decimal Number to Binary
Number
Input: Decimal Number: 35
Output: Binary Number: 100011
*/

import java.io.*;

class DecimalToBinary2{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Decimal Number");

		int dec = 0;

		try{
			dec = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int sum = 0;
		int gum = 0;
		int rum = 0;
		int yum = 0;

		while(dec!=0){
			gum = dec%2;
			dec = dec/2;
			rum = rum*10+gum;
		}

		while(rum!=0){
			yum = rum%10;
			sum = sum*10+yum;
			rum = rum/10;
		}

		System.out.println("Binary Number : "+sum);
	}
}