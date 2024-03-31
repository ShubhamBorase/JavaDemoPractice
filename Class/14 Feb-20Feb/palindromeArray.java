

import java.io.*;

class PalindromeArray{
        public static void main (String...args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Total Numbers You Want To Enter");
		int num = Integer.parseInt(br.readLine());
		int [] x = new int [num];
		System.out.println("Enter The Numbers");

		for (int i=0; i<num; i++){
			x [i] = Integer.parseInt(br.readLine());
		}
		for (int i=0; i<num; i++){
			int ulta=0;
			int sulta=x[i];
			for ( ; x[i]!=0; ){
				int rem=x[i]%10;
				ulta=ulta*10+rem;
				x[i]=x[i]/10;
			}
			if (sulta==ulta){
				System.out.println(sulta+" Palindrome Number is present at Array "+ i);
			}else
				System.out.println(sulta+" is not a Palindrome");
		}
	}
}
