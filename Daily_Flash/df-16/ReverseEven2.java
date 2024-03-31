/*
Write a Program that prints a series of Even numbers in reverse order
from the limiting number entered by the user.
Input: 100
Output: 100 98 96 . . .. 0
*/

import java.io.*;

class ReverseEven2{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Number From Which You Want To Print The Even Series");
		
		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = num; i>=0; i--){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}