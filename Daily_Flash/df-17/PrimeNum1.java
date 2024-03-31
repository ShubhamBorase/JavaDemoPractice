/*
Write a Program that checks whether the entered number is a
Prime Number or not.
{Note: A Prime Number is that number which is only divisible by 1 & that
number only.}
*/

import java.io.*;

class PrimeNum1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		boolean flag = true;

		System.out.println("Enter the Number ");

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

		if(flag==true){
			System.out.println("Entered Number "+num+" is a Prime Number");
		}else{
			System.out.println("Entered Number "+num+" is not a Prime Number");
		}
	}
}