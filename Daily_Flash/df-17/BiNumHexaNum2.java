/*
Write a Program to convert entered Binary Number to
Hexadecimal Number.
Input:
Output:
Binary Number: 1011
Hexadecimal Number: B
*/

import java.io.*;

class BiNumHexaNum2{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Number To Convert It To Binary");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println("Binary Number : "+num);

		switch(num){
			case 0000 :
				System.out.println("Hexadecimal Number : 0");
				break;
			case 0001 :
				System.out.println("Hexadecimal Number : 1");
				break;
			case 0010 :
				System.out.println("Hexadecimal Number : 2");
				break;
			case 0011 :
				System.out.println("Hexadecimal Number : 3");
				break;
			case 0100 :
				System.out.println("Hexadecimal Number : 4");
				break;
			case 0101 :
				System.out.println("Hexadecimal Number : 5");
				break;
			case 0110 :
				System.out.println("Hexadecimal Number : 6");
				break;
			case 0111 :
				System.out.println("Hexadecimal Number : 7");
				break;
			case 1000 :
				System.out.println("Hexadecimal Number : 8");
				break;
			case 1001 :
				System.out.println("Hexadecimal Number : 9");
				break;
			case 1010 :
				System.out.println("Hexadecimal Number : A");
				break;
			case 1011 :
				System.out.println("Hexadecimal Number : B");
				break;
			case 1100 :
				System.out.println("Hexadecimal Number : C");
				break;
			case 1101 :
				System.out.println("Hexadecimal Number : D");
				break;
			case 1110 :
				System.out.println("Hexadecimal Number : E");
				break;
			case 1111 :
				System.out.println("Hexadecimal Number : F");
				break;
		}
	}
}