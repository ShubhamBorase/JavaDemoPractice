/*
Write a Program to Convert the entered distance in Kilometer
by user into meter.
Input: Enter Distance in KM: 1
Output: 1 KM is equal to 1000m
*/

import java.io.*;

class KMToM3{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		float km = 0;

		try{
			km = Float.parseFloat(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println(km+" KM is Equal to "+(km*1000.0)+" m");
	}
}