/*
Write a Program that prints the series which increases with
the number entered by the user till 1000.
Input: 15
Output: 1 16 31 46 . . ..
*/

import java.io.*;

class Increase1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter the Number");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int x = 1; x<1000; x = x+num){
			System.out.print(x+" ");
		}
	}
}