/*
Write a Program that calculates Kinetic Energy of an object
with given Mass & Velocity.
{Note: K.E. = ½ * m * v * v }
Input: Mass = 53kg Velocity = 5m/s
Output: Kinetic Energy of that Object is: 662.5
*/

import java.io.*;

class KineticEnergy2{
	public static void main(String...args){

		int m = 0;
		int v = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Mass Of Object in KG");

		try{
			m = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		System.out.println("Enter The Velocity Of Object in m/s");

		try{
			v = Integer.parseInt(br.readLine());
		}catch(IOException ie1){
			ie1.printStackTrace();
		}

		float ke = m*v*v*1/2;

		System.out.println("Kinetic Energy Of that Object is : "+ke);
	}
}