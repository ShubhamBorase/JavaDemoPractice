/*
Write a Program that computes the sum of all possible divisors of
an entered number.
Input: 25
Output: The of all possible divisors of 24 is : 39
*/

import java.io.*;

class DivisorSum5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The  Number");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int sum = 0;

		for(int i = 1; i<=num/2; i++){
			if(num%i==0){
				sum = sum+i;
			}
		}

		System.out.println("Sum Of Divisors of "+num+" is "+sum);
	}
}