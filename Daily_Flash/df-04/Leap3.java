
import java.io.*;

class Leap3{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Creating Stream

		int year = 1;									// Initialising variable

		System.out.println("Enter Year to check for Leap year");
		try{										//Try block
			year = Integer.parseInt(br.readLine());					//Taking Input
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();
			}catch(IOException io1){
				System.out.println("System Error");
			}
		}

		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println("The year "+year+" is a Leap year");
				}else
					System.out.println("The year "+year+" is not a Leap year");
			}else if(year%100!=0){
				System.out.println("The year "+year+" is a Leap year");
			}
		}else
			System.out.println("The year "+year+" is not a Leap year");
	}
}
