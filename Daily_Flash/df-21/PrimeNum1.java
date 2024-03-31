/*
Write a Program to determine whether a number entered by a user
is a Prime Number or Not.
{Note: Prime Number is such a number, which is only divisible by 1 & that
number itself}
Input: 5
Output: 5 is a Prime Number.
*/

import java.io.*;

class PrimeNum1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		boolean flag = true;

		System.out.println("Enter The Number ");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = 2; i<=num/2; i++){
			if(num%i==0){
				flag = false;
			}
		}

		if(flag == false){
			System.out.println("The Number "+num+" is not a Prime Number");
		}else{
			System.out.println("The Number "+num+" is a Prime Number");
		}
	}
}