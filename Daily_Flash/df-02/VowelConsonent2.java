

import java.io.*;

class VowelConsonent2{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char c;
		System.out.println("Enter the character");
		try{									//try block
			c = (char)br.read();
			if(((c>64)&&(c<91))||((c>96)&&(c<123))){
				switch (c){						//switch case to check wheher inputs is Vowel or consonent
					case 'a':
						System.out.println("The Character is Vowel");
						break;
					case 'e':
						System.out.println("The Character is Vowel");
						break;
					case 'i':
						System.out.println("The Character is Vowel");
						break;
					case 'o':
						System.out.println("The Character is Vowel");
						break;
					case 'u':
						System.out.println("The Character is Vowel");
						break;
					case 'A':
						System.out.println("The Character is Vowel");
						break;
					case 'E':
						System.out.println("The Character is Vowel");
						break;
					case 'I':
						System.out.println("The Character is Vowel");
						break;
					case 'O':
						System.out.println("The Character is Vowel");
						break;
					case 'U':
						System.out.println("The Character is Vowel");
						break;
					default :
						System.out.println("The Character is a Consonent");
						break;
				}
			}else
				System.out.println("Give right input");
		}catch(IOException io){
			System.out.println("Input Error");
		}
	}
}
