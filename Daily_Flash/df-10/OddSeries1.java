import java.io.*;

class OddSeries1{
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int min = 1;
			int max = 1;

			System.out.println("Enter the Minimum Number And Maximum Number in the Series respectively");
			try{
				min = Integer.parseInt(br.readLine());
				max = Integer.parseInt(br.readLine());
			}catch(IOException io){}

			System.out.println(" Min of Series is "+min);
			System.out.println(" Max of Series is "+max);

			System.out.print("Output Series Of Odd Numbers Ranging Between "+min+" and "+max+" is");
			for(int i = min; i<=max; i++){
				if(i%2==1){
					System.out.print(i+" ");
				}
			}
	}
}
