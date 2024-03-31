
import java.io.*;

class Askii5{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Stream Input

		char ch = 1;

		try{
			ch = (char)br.read();
		}catch(IOException io){
			System.out.println("System Error");
		}finally{
			try{
				br.close();
			}catch(IOException io1){
				System.out.println("System Error");
			}
		}

		int in = ch;
		System.out.println(in);
	}
}
