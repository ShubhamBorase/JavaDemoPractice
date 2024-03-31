/*
Write a Program to Swap two entered numbers without using
a third temporary variable.
Input: 10 30
Output:
Before Swap: a = 10 & b = 20
After Swap: a = 20 & b = 10
*/

import java.io.*;

class SwapIt1{
	public static void main(String...args){
		
		int a = 0;
		int b = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The First Number");
		
		try{
			a = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println("Enter The Second Number");
		
		try{
			b = Integer.parseInt(br.readLine());
		}catch(IOException ie1){
			ie1.printStackTrace();
		}

		System.out.println("Before Swap : a = " +a+" and b = "+b);

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("After Swap : a = " +a+" and b = "+b);
	}
}