
import java.io.*;

class Grades5{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Creating Stream

		int physics = 100;								// initiasization
		int chem = 100;
		int math = 100;
		int bio = 100;
		int comp = 100;

		System.out.println("Enter your marks of Physics, Chemistry, Biology, Mathmatics and Computer Respectively");

		try{
			physics = Integer.parseInt(br.readLine());				//Input
			chem = Integer.parseInt(br.readLine());
			bio = Integer.parseInt(br.readLine());
			math = Integer.parseInt(br.readLine());
			comp = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();							//Closing Stream
			}catch(IOException io2){
				System.out.println("System Error");
			}
		}

		double percent = (physics+chem+bio+math+comp)*100/500;				//Formulae for percentage

		System.out.println("Your Percentage is "+percent);

		if(percent>90){
			System.out.println("Your Grade is A");
		}else if((percent<90) && (percent>80)){
			System.out.println("Your Grade is B");
		}else if((percent<80) && (percent>70)){
			System.out.println("Your Grade is C");
		}else if((percent<70) && (percent>60)){
			System.out.println("Your Grade is D");
		}else if((percent<60) && (percent>40)){
			System.out.println("Your Grade is E");
		}else
			System.out.println("Your Grade is F");
	}
}
