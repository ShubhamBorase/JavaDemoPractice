/*
Write a Program that accepts 5 integer values from the user and
compares two consecutive inputs and if the second of them is lesser than the
previous one then the code exits out of loop and prints the unexpected input.
{Note: Use Break Statement}
Input: 1 3 5 4
Output: Loop is exited with input 4.
*/

import java.io.*;

class BreakLoop5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0; 
		int num2 = 0;

		for(int i = 0; i<5; i++){
			
			try{
				num2 = Integer.parseInt(br.readLine());
			}catch(IOException ie){
				ie.printStackTrace();
			}

			if(num2<num1){
				System.out.println("Loop is exited with input : "+num2);
				break;
			}

			num1 = num2;
		}
	}
}