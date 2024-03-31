import java.io.*;


class ReverseString2{
        public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter The String You Wane To Reverse");

		String st= br.readLine();
		StringBuffer sb=new StringBuffer(st);
		st=sb.reverse().toString();
		System.out.println(st);
        }
}
