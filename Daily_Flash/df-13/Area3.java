/*
Write a Program to take input length and breadth of rectangle
and calculate its area.
*/

import java.io.*;

class Area3{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = 0;
		int breadth = 0;

		System.out.println("Enter The Length and Breadth of Rectangle Respectively");
		
		try{
			length = Integer.parseInt(br.readLine());
			breadth = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Input Stream Closed");
		}

		System.out.println("Area of rectangle = "+(length*breadth));
	}
}