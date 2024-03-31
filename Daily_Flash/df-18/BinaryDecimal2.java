/*
Write a Program to Convert entered Binary Number to Decimal
Number
Input: Binary Number: 1011
Output: Decimal Number: 11
*/

import java.lang.Math;
import java.io.*;

class BinaryDecimal2{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Binary Number");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int temp = num;
		int count = 0;
		double sum = 0;
		double rum = 0;
		int yum = 0;

		while(temp!=0){
			yum = temp%10;
			rum = yum*(Math.pow(2,count));
			sum = sum+rum;
			temp = temp/10;
			count++;
		}
		System.out.println("Binary Number is : "+num);
		System.out.println("Decimal Number is : "+sum);
	}
}