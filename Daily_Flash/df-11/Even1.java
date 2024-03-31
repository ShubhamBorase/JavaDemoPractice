import java.io.*;

class Even1{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int min = 1;
		int max = 1;

		System.out.println("Enter The Numbers To Print The Even Numbers Ranging In them ");

		try{
			min = Integer.parseInt(br.readLine());
			max = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		System.out.println("Series of Even Numbers ranging between "+min+" and "+max+" is");
		for(int i = min; i<=max; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}