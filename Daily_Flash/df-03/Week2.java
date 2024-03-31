
import java.io.*;

class Week2{
	public static void main(String...args){
		
		int day = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// Connecting Stream

		System.out.println("Enter the number on Day from 0-6");					// 0-7 as we have 7 days week
		try{
			day = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("System Error");
		}

		switch (day){
			case 0 :
				System.out.println("Monday");
				break;
			case 1 :
				System.out.println("Tuesday");
				break;
			case 2 :
				System.out.println("Wednesday");
				break;
			case 3 :
				System.out.println("Thursday");
				break;
			case 4 :
				System.out.println("Friday");
				break;
			case 5 :
				System.out.println("Saturday");
				break;
			case 6 :
				System.out.println("Sunday");
				break;
			default :
				System.out.println("Please enter vaild number");
		}
	}
}
