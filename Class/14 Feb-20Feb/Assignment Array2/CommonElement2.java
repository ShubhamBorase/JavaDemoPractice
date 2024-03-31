

import java.io.*;

class CommonElement2{
	public static void main (String...args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of First Array");
		int num= Integer.parseInt(br.readLine());
		int [] x= new int[num];

		System.out.println("Enter The Elements Of First Array");
		for (int i=0; i<num; i++){
			x[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter The Size of Second Array");
		int num2=Integer.parseInt(br.readLine());
		int [] y= new int [num2];

		System.out.println("Enter The Elements Of Second Array");
		for (int j=0; j<num2; j++){
			y[j]=Integer.parseInt(br.readLine());
		}

		int count=0;
		for(int i=0; i<num; i++){
			for (int j=0; j<num2; j++){
				if (x[i]==y[j]){
					System.out.print(x[i]);
					count++;
				}
			}
		}
		System.out.println(" Elements are Common In Both Array");
	}
}
