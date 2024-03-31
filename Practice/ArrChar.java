import java.io.*;

class ArrChar{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array");

		int size = Integer.parseInt(br.readLine());
		char [] ch = new char [size];

		for(int i = 0; i<size; i++){
			ch [i] = (char)br.read();
			br.skip(2);
		}
		System.out.println(ch);
	}
}