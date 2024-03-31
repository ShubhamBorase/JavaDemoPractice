
import java.io.*;

class Alphabet1{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Input");
		try{
			char c = (char)br.read();

			if((c<123) && (c>96)){
				System.out.println("Given Input "+c+" is Character");
			}else if ((c<91) && (c>64)){
				System.out.println("Given Input "+c+" is Character");
			}else
				System.out.println("Given Input "+c+" is not a Character");

		}catch(IOException io){
                        System.out.println("System error Occured");
                }
	}
}
