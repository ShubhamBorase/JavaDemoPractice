/*
Write a Program to print sum of series up to the nth entered
number.
Series is: 9, 99, 999, 9999, 9999 . . .. n.
Input: Nth Element in series: 5
Output: the sum of: 9 + 99 + 999 + 9999 + 99999 = 111105
*/

import java.io.*;

class Series5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Nth Element Of Series");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int sum = 0;
		int gum = 0;

		System.out.print("The Sum Of : ");

		for(int i = 0; i<num; i++){
			sum = sum*10+9;
			System.out.print(" + "+sum);
			gum = gum+sum;
		}

		System.out.println(" = "+gum);
	}
}