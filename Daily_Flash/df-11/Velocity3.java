import java.io.*;

class Velocity3{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int velocity = 0;
		int distance = 0;
		int time = 0;

		System.out.println("Enter the Distance and time respectively in meters and seconds");

		try{
			System.out.println("Distance = ");
			distance = Integer.parseInt(br.readLine());

			System.out.println("Time Taken = ");
			time = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		velocity = distance/time;

		System.out.println("The Velocity of Particle roaming in Space is "+velocity+"m/s");
	}
}