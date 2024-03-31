
import java.io.*;

class DiviMulti2{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in1 = 0;
		int in2 = 0;

		System.out.println("Give 2 Numbers as Input");

		try{
			in1 = Integer.parseInt(br.readLine());
			in2 = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("Error");
		}

		System.out.println("Multiplication is "+(in1*in2));

		if(in1>in2){
			System.out.println("Division is "+(in1/in2));
		}else if(in2>in1){
			System.out.println("Division is "+(in2/in1));
		}else{
			System.out.println("Division is "+(in1/in2));
		}
	}
}
