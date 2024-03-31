

import java.io.*;

// try this code in frequency way

class Palindrome6{
        public static void main (String...args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Total Number Of Panlindrome Numbers You Want To Enter");
                int n = Integer.parseInt(br.readLine());
                int temp=n;
		int ulta=0;
                for ( ; n!=0; ){
			//reminder
			int rem=n%10;
			// store rem in int ukta
			ulta=ulta*10+rem;
			n=n/10;
		}
			if (temp==ulta){
			System.out.println(temp+" is Palindrome of "+ulta);
			}else
				System.out.println(temp+" is not a Palindrome");
        }
}
