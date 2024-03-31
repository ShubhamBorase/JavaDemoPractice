/*Write a Program to print table in reverse order.*/

import java.io.*;

class Table1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter the Number of which You Want Table");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Input Stream Closed");
		}

		for(int x = 10; x>0; x--){
			System.out.println(num+" x "+(x*num));
		}
	}
}