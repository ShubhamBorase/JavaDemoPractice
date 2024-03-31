


import java.io.*;

class ValueOfN3{
	public static void main (String...args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Total Number Of Elements");
		int in=Integer.parseInt(br.readLine());
		System.out.println("Enter The Elements Of Array");

		int [] arr= new int [in];

		for (int i=0; i<in; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for (int i=0; i<in; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
