/*
Write a Program that prints a series of perfect numbers up
to the entered limiting number.
Input: 100
Output: The Series of all perfect number from 1 to 100 is
1, 6, 28
*/

import java.io.*;

class PerfectNum5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0;
		int num2 = 0;

		System.out.println("Enter The Start And End Of Range Respectively");

		try{
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int x = num1; x<=num2; x++){
			int sum = 0;
			for(int y = 1; y<=x/2; y++){
				if(x%y==0){
					sum = sum+y;
				}
			}
			if(sum==x){
				System.out.println(sum+" ");
			}
		}
	}
}