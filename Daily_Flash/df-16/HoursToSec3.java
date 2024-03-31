/*
Write a Program to Convert the Hours entered by the user into
Seconds.
Input: 1hr
Output: 3600 seconds
*/

import java.io.*;

class HoursToSec3{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int hr = 0;

		System.out.println("Enter The Hours");

		try{
			hr = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int sec = hr*60*60;

		System.out.println(hr+" hours = "+sec+" Sec");
	}
}