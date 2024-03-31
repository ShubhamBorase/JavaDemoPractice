/*Write a Program that accepts Three integers from the user
and prints a minimum number from them.*/

import java.io.*;

class Min5{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.println("Enter the 3 Numbers");

		try{
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
			num3 = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Input Stream Closed");
		}

		if(num1>num2){
			if(num1>num3){
				System.out.println("The Minimum Number among"+num1+","+num2+" and "+num3+" is "+num1);
			}else{
				System.out.println("The Minimum Number among"+num1+","+num2+" and "+num3+" is "+num3);
			}
		}else if(num2>num3){
				System.out.println("The Minimum Number among"+num1+","+num2+" and "+num3+" is "+num2);
			}else{
				System.out.println("The Minimum Number among"+num1+","+num2+" and "+num3+" is "+num3);
			}
	}
}