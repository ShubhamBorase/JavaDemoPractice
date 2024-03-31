
import java.io.*;

class MaxInput{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in1,in2,in3;

		try{
			in1=Integer.parseInt(br.readLine());
			in2=Integer.parseInt(br.readLine());
			in3=Integer.parseInt(br.readLine());
			if(in1<in2){
				if(in3>in2){
					System.out.println("The Greater Number is "+in3);
				}else
					System.out.println("The Greatest Number is "+in2);
			}else if(in1>in2){
				if(in3>in1){
					System.out.println("The Greater Number is "+in3);
				}else
					System.out.println("The Greater Number is "+in1);
			}

		}catch(IOException io){
			System.out.println("System error");
		}
	}
}
