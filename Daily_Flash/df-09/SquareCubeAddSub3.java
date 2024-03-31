
import java.io.*;

class SquareCubeAddSub3{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in1 = 0;
		int in2 = 0;

		System.out.println("Enter The Two Numbers");
		try{
			in1 = Integer.parseInt(br.readLine());
			in2 = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		System.out.println("Addition of "+(in1*in1*in1)+" and "+ (in2*in2*in2)+" is "+((in1*in1*in1)+(in2*in2*in2)));
		
		if(in1>in2){
			System.out.println("Substraction of "+(in1*in1)+" and "+(in2*in2)+" is "+((in1*in1)-(in2*in2)));
		}else if(in2>=in1){
			System.out.println("Substraction of "+(in2*in2)+" and "+(in1*in1)+" is "+((in2*in2)-(in2*in2)));
		}
	}
}
