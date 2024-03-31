/*
Write a Program to Implement Ohm's Law. 
*/

import java.io.*;

class Ohm3{
	public static void main(String...args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double current= 0;
		double resistance= 0;

		System.out.println("Enter the resistance count");
		try{
			resistance = Double.parseDouble(br.readLine());
			System.out.println("Enter the Current count");
			current = Double.parseDouble(br.readLine());
		}catch(IOException io){
			System.out.println("Stream Closed");
		}

		System.out.println("Voltage is "+current*resistance);
	}
}
