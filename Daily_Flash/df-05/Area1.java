

import java.io.*;

class Area1{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Creating Stream
		
		double radius = 1;								//Initialising variable

		System.out.println("Enter the Radius of circle");

		try{
			radius = Float.parseFloat(br.readLine());				//Taking input from user
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();							//Closing Input Stream
			}catch(IOException io1){
				System.out.println("System Error");
			}
		}

		radius = radius*radius;								//Changing radius to radius square

		System.out.println("Area of Circle is "+ 3.14*radius);				//Formulae is pie*radius*radius
	}
}
