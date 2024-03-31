

import java.io.*;

class Month3{
	public static void main(String...args){
		
		int month = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			month = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("System Error");
		}

		switch(month){
			case 1 :
				System.out.println("Number of Days in Month of January is 31");
				break;
			case 2 :
				System.out.println("Number of Days in Month of February is 30");
				break;
			case 3 :
				System.out.println("Number of Days in Month of March is 31");
				break;
			case 4 :
				System.out.println("Number of Days in Month of April is 28");
				break;
			case 5 :
				System.out.println("Number of Days in Month of May is 31");
				break;
			case 6 :
				System.out.println("Number of Days in Month of Jun is 30");
				break;
			case 7 :
				System.out.println("Number of Days in Month of July is 31");
				break;
			case 8 :
				System.out.println("Number of Days in Month of August is 31");
				break;
			case 9 :
				System.out.println("Number of Days in Month of September is 30");
				break;
			case 10 :
				System.out.println("Number of Days in Month of October is 31");
				break;
			case 11 :
				System.out.println("Number of Days in Month of November is 30");
				break;
			case 12 :
				System.out.println("Number of Days in Month of December is 31");
				break;
		}
	}
}
