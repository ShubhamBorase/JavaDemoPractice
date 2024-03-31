/*
Write a Program that prints a series of Prime numbers ranging
between 1 to 100.
Output: 1 2 3 5 . . .
*/

import java.io.*;

class PrimeRange1{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0;
		int num2 = 0;

		System.out.println("Enter Start And End Of Range");
		
		try{
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int j = num1; j<num2;j++){
			boolean flag = true;
			for(int i = 2; i<=j/2; i++){
				if(j%i==0){
					flag = false;
				}
			}
			if(flag==true){
				System.out.print(j+" ");
			}
		}
	}
}