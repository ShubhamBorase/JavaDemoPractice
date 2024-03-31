
import java.io.*;

class House implements Runnable{
	
	void nailCutting(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br=null;
		try{
			String nailCutter = new String(br.readLine());
		}catch(IOException io){
			
		}
	}

	public void run(){
		nailCutting();
	}

	public static void main(String[] args) {
		System.out.println("Where is Nail Cutter");
		House h = new House();
		Thread t = new Thread(h);

		t.start();
	}
}