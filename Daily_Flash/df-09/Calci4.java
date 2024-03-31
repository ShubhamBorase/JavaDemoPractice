
import java.io.*;

class Calci4{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in1 = 0;
		int in2 = 0;

		System.out.println("Enter the Numbers");

		try{
			in1 = Integer.parseInt(br.readLine());
			in2 = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		char in3 = '+';

		System.out.println("Give Operation you want to perform");

		try{
			in3 = (char)br.read();
		}catch(IOException io1){
		}

		switch(in3){
			case '+':
				System.out.println(in1+in2);
				break;
			case '-':
				System.out.println(in1-in2);
				break;
			case '*':
				System.out.println(in1*in2);
				break;
			case '/':
				System.out.println(in1/in2);
				break;
			default :
				System.out.println("Wong Input");
				break;
		}
	}
}
