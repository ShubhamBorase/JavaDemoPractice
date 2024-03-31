

import java.io.*;

class Triangle5{
	public static void main(String...args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Stream Opening

		int a1 = 30;									//Declaring Variables
		int a2 = 60;
		int a3 = 90;

		System.out.println("Please give measure of angle respectively");
		try{
			a1 = Integer.parseInt(br.readLine());					//Taking Input
			a2 = Integer.parseInt(br.readLine());
			a3 = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();
			}catch(IOException io1){
				System.out.println("System Error");
			}
		}

		int total = a1+a2+a3;								// Adding Input
		if (total==180){								//Verifing if its a triangle or not
			System.out.println("The Triangle With angle "+a1+" "+a2+" and "+a3+" is Valid");
		}else {
			System.out.println("The Triangle With angle "+a1+" "+a2+" and "+a3+" is not Valid");
		}
	}
}
