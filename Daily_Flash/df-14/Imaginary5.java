/*
Write a Program that calculates addition of two complex
numbers.
Input:
Enter Number 1:
Real Part: 5
Imaginary Part: 3
Enter Number 2:
Real Part: 2
Imaginary Part: 1
Output: The Addition of 5+3i & 2+I is 7+4i.
*/

import java.io.*;

class Imaginary5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int r1 = 0;
		int r2 = 0;
		int i1 = 0;
		int i2 = 0;

		System.out.println("Enter the Real Part of 1st Number");

		try{
			r1 = Integer.parseInt(br.readLine());
			System.out.println("Enter the Imaginary Part of 1st Number");
			i1 = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println("Enter the Real Part of 2nd Number");

		try{
			r2 = Integer.parseInt(br.readLine());
			System.out.println("Enter the Imaginary Part of 2nd Number");
			i2 = Integer.parseInt(br.readLine());
		}catch(IOException ie1){
			ie1.printStackTrace();
		}

		System.out.println("Addition of "+r1+"+"+i1+"i and "+r2+"+"+i2+"i is "+(r1+r2)+"+"+(i1+i2)+"i");
	}
}