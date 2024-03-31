/*
Write a Program that prints a series of odd numbers in reverse order
from the limiting number entered by the user.
Input: 100
Output: 99 97 95 93 . . .. 1
*/

import java.io.*;

class ReverseOdd1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Number From Which You Want Print The Odd Numbers");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = num; i>0; i--){
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
	}
}