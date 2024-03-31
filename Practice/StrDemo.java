import java.io.*;

class StrDemo{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = "Shubh";
		String str2 = "Shubh";
		String str3 = "ShubhBorase";
		String str4 = "Shubh"+"Borase";
		String str5 = str1+"Borase";
		String str6 = str1+"Borase";

		System.out.println("1 2 "+(str1==str2)); //true
		System.out.println("2 3 "+(str2==str3)); //false
		System.out.println("3 4 "+(str3==str4)); //true
		System.out.println("4 5 "+(str4==str5)); //false
		System.out.println("3 5 "+(str3==str5)); //false
		System.out.println("5 6 "+(str5==str6)); //false
	}
}