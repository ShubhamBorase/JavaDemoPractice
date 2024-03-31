import java.io.*;

class OddNum3{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num2 = 0;

		System.out.println("Enter The End Of The Series");

		try{
			num2 = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = 1; i<=num2; i++){
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
	}
}