/*
Write a Program to that accepts two integers from user and
calculates the Quotient & Reminder from their division
Input: 10 5
Output:
Quotient: 2
Reminder: 0
*/

import java.io.*;

class ReminderQuotient3{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;
		int y = 0;

		System.out.println("Enter the Two Numbers for Division respectively");

		try{
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println("Quotient: "+x/y);
		System.out.println("Reminder: "+x%y);
	}
}