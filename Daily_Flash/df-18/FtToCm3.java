/*
Write a Program to Convert enter distance in feet to centimeters.
Input: Distance in Feet: 6ft
Output: Equivalent distance for 6ft in cm is 180cm.
*/

import java.io.*;

class FtToCm3{
	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		double num = 0;

		System.out.println("Enter The Distance in Feet");

		try{
			num = Double.parseDouble(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println("Equivalent distance for "+num+"ft in cm is "+num*30.48);
	}
}