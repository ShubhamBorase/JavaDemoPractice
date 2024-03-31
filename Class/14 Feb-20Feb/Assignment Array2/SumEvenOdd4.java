


import java.io.*;

class SumEvenOdd4{
	public static void main (String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		int in=Integer.parseInt(br.readLine());
		int [] arr=new int [in];

		System.out.println("Enter The Numbers");

		for (int i=0; i<in; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int esum=0;
		int osum=0;
		for (int i=0; i<in; i++){
			if (arr[i]%2==0){
				esum=esum+arr[i];
			}else
				osum=osum+arr[i];
		}

		System.out.println("The Sum Of Even Numbers In An Array Is "+esum);
		System.out.println("The Sum Of Odd Number In An Array Is "+osum);
	}
}

