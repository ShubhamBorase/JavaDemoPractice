/*
Write a Program which detects whether the entered number
is perfect or not .
{Note: If the sum of the perfect divisors of a number is equal to the
entered number then it is considered as a perfect one.}
Input : 6
Output : 6 is a Perfect number.
*/

import java.io.*;


class PerfectNum1{
	public static void main(String[] args){

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		//creating stream

		System.out.println("Enter the number to check whether the Number is Perfect or not");

		int num = 0;

		try{
			num = Integer.parseInt(br.readLine());									//taking input
		}catch(IOException ie){
			System.out.println("Stream Breaked");
		}

		int storage = 0;

		for(int i = 1; i<num/2; i++){
			if(num%i==0){
				storage = storage + i;
			}
		}

		storage = storage*2;
		
		if(storage==num){
			System.out.println("The Given Number "+num+" is a Perfect Number");
		}else{
			System.out.println("The Given Number "+num+" is not a Perfect Number");
		}
	}
}