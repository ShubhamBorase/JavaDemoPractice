
import java.io.*;

class Employee3{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Input Stream

		char gen = 'q';									//Initialising
		int age = 1;
		char married = 'q';

		System.out.println("Are you Male of Female ? ( Enter M or F )");
		try{
			gen = (char)br.read();
			br.skip(1);
			System.out.println("Are You Married ( Y or N )");
			married = (char)br.read();
			br.skip(1);
		}catch(IOException io){
			System.out.println("System Error");
		}

		switch(gen){
			case 'M':
			case 'm':
				System.out.println("To Work Your age Should be above 20");
				try{
					age = Integer.parseInt(br.readLine());
				}catch(IOException io1){
					System.out.println("System Error");
				}

				if((age<41) && (age>19)){
					System.out.println("You Can Choose any Site you want");
				}else if((age<61) && (age>40)){
					System.out.println("You Can Work Only In Urban Area");
				}else
					System.out.println("You are not eligible for work");
				break;
			case 'F':
			case 'f':
				System.out.println("You Can Work Only In Urban Area");
				break;
			default :
				System.out.println("Error");
				break;
		}
	}
}
