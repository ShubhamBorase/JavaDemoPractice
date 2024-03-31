/*
Write a Program that accepts an integer from the user and
prints its second successor and second predecessor.
*/

import java.io.*;

class PlusMinus2{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Number for which you want 2nd predecessor and 2nd successor");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Input Stream Closed");
		}

		System.out.println("Second Predecessor: "+(num-2));
		System.out.println("Second Successor: "+(num+2));
	}
}