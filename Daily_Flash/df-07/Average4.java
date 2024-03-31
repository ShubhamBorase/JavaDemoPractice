
import java.io.*;

class Average4{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double sum = 0;

		for(int i = 0; i<10; i++){
			try{
				double num = Double.parseDouble(br.readLine());
				sum = sum+num;
			}catch(IOException io){
			}
		}

		double avg = sum/10;

		System.out.println(sum);
		System.out.println(avg);
	}
}
