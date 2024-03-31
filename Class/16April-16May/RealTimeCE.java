
import java.io.*;

class Loan implements Runnable{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void document(){
		System.out.println("Counter is closed to give application and documents");
		String doc = "Application";
		try{
			br.close();
		}catch(IOException ie){}

		doc = new String(br.readLine());
	}

	public void run(){
		document();
	}

	public static void main(String[] args) {
		System.out.println("In Bank");

		Loan rs = new Loan();
		Thread t = new Thread(rs);
		t.start();
	}
}