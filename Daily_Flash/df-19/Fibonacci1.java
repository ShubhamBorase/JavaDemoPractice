/*
Write a Program to print Fibonacci Series of 5 Elements.
{Note: In the Fibonacci series the next element is the sum of the previous two
elements}
Output: 0 1 1 2 3.
*/

import java.io.*;

class Fibonacci1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 1;
		int y = 0;

		int num = 0;

		System.out.println("Emnter The total Element of Series");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = 0; i<num; i++){
			System.out.print(y+" ");
			x = x+y;
			y = x-y;
		}
	}
}