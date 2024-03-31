


import java.io.*;

class StringFrequency7{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The String");
		String str=br.readLine();

		char [] ch=str.toCharArray();

		int [] count=new int [str.length()];
		for (int i=0; i<str.length(); i++){
			count[i]=1;
			for (int j=i+1; j<str.length(); j++){
				if(ch[i]==ch[j]){
					count[i]++;
					ch[j]=0;
				}
			}
			if (ch[i]!=0){
				System.out.println("The Frequency Of "+ch[i]+" is "+count[i]);
			}
		}
	}
}
