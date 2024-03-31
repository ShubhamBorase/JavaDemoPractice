/*
Write a Program that takes rupees as input from the user
and convert them into dollars.
*/

import java.io.*;

class INRToD{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double rs = 0;
		double doller = 0;

		System.out.println("Enter The Value Of One Doller in INR");

		try{
			doller = Double.parseDouble(br.readLine());
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

		System.out.println("Enter The Amnount of Rs");

		try{
			rs = Double.parseDouble(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println(rs+" Rs = "+(rs/doller)+"$");
	}
}