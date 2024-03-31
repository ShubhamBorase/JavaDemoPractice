
import java.io.*;

class Bill2{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Stream

		int unit = 1;									//Initialising 

		System.out.println("Enter The Unit of Energy you Used");

		try{
			unit = Integer.parseInt(br.readLine());					//Taking Input
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();							//Closing Stream
			}catch(IOException io1){
				System.out.println("System Error");
			}
		}

		if(unit<=50){
			System.out.println("The Amount for "+unit+" is "+unit*0.5);
		}else if((unit<=150) && (unit>49)){
			System.out.println("The Amount for "+unit+" is "+unit*0.75);
		}else if((unit<=250) && (unit>150)){
			System.out.println("The Amount for "+unit+" is "+unit*1.2);
		}else if(unit>250){
			System.out.println("The Amount for "+unit+" is "+unit*1.5);
		}
	}
}
