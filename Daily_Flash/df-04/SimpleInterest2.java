
import java.io.*;

class SimpleInterest2{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Creating Stream

		double interest = 1;								//Initialising variables
		double principal = 1;
		double rateI = 1.1;
		double time = 1;

		try{
			System.out.println("Enter the Principal amount");			//Taking input for principal
			principal = Double.parseDouble(br.readLine());

			System.out.println("Enter the rate of interest");			//Taking input for rste of interest
			rateI = Double.parseDouble(br.readLine());

			System.out.println("Enter the time period");				//Time period of loan
			time = Double.parseDouble(br.readLine());

		}catch(IOException io){
			System.out.println("System error");
		}finally{
			try{
				br.close();
			}catch(IOException io1){
				System.out.println("System error");
			}
		}

		interest = (principal*rateI*time)/100;

		System.out.println("The total interest on "+principal+" is "+interest);
		System.out.println("And total payable amout is "+(principal+interest));
	}
}
