
import java.io.*;

class LetterCase1{
	public static void main(String...args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//creating stram

		char c ='!';										// declaring a character

		System.out.println("Enter the Letter");
		try{											//try block
			c = (char)br.read();								// taking input from user

		}catch(IOException io){									// catch block
			System.out.println("This is System error");
		}

		if ((c<91)&&(c>64)){
			System.out.println("Letter "+c+" is in UPPER CASE");
		}else if((c<123)&&(c>96)){
			System.out.println("Letter "+c+" is in lower case");
		}else
			System.out.println("Please Enter Valid Input");
	}
}
