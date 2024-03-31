

import java.io.*;

class Character1{
	public static void main (String...args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		int num=Integer.parseInt(br.readLine());
		char []ch = new char [num];
		System.out.println("Enter The Characters");

		for (int i=0; i<num; i++){
			ch [i]=(char)br.read();
			br.skip(1);
		}

		for (int i=0; i<num; i++){
			if (ch [i]>64){
				if (ch [i]<91){
				System.out.print(ch[i]+" ");
				}
			}
			if (ch [i]>96){
				if(ch [i]<123){
				System.out.print(ch [i]+" ");
					}
			}
		}
	}
}
