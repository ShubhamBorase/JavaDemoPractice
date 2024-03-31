import java.io.*;

class Cube3{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in = 1;

		System.out.println("Enter The Max Number For Series of Cube");

		try{
			in = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		for(int i = 1; i<=in; i++){
			int cube = i*i*i;
			int square = i*i;
			System.out.println("Cube of "+i+" : "+cube+" and Square of "+i+" : "+square);
		}
	}
}