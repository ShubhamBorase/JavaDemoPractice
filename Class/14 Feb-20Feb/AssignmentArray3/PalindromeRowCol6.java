

import java.io.*;

class PalindromeRowCol6{
	public static void main(String...args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Number Of Rows");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter The Number Of Columns");
		int col=Integer.parseInt(br.readLine());

		int [][] arr= new int [row][col];
		int temp=10;
                for (int i=0; i<row; i++){
			for (int j=0; j<col; ){
					
				int n=temp;
				int ulta=0;
				while(n!=0){
					//reminder
					int rem=n%10;
					// store rem in int ukta	
					ulta=ulta*10+rem;
					n=n/10;
				}
				if (temp==ulta){
					System.out.print(temp+" ");
					j++;
				}
				temp++;
				
			}
			System.out.println();
		}
	}
}
