

import java.io.*;

class Identify3{
	public static void main(String...args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char c;

		System.out.println("Give the Input");
		try{
			c =(char)br.read();
			if(((c<91)&&(c>64))||((c<123)&&(c>96))){
                        	System.out.println("Input is Alphabet");
			}else if((c<58)&&(c>47)){
				System.out.println("Input is Digit");
			}else if(((c<48)&&(c>31))||((c<65)&&(c>57))||((c<97)&&(c>90))||((c<=126)&&(c>122))){
				System.out.println("Input is special character");
			}
		}catch(IOException io){
			System.out.println("System Error Caused Disruption");
		}
		
	}
}
