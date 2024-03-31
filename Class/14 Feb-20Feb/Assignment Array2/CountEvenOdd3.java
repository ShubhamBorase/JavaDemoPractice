


import java.io.*;

class CountEvenOdd3{
	public static void main (String...args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Total Number Of Elements In Array");
		int in=Integer.parseInt(br.readLine());

		int [] arr=new int [in];

		System.out.println("Enter The Numbers");
		for (int i=0; i<in; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int even=0;
		int odd=0;
		for (int i=0; i<in; i++){
			if (arr[i]%2==0){
				even++;
			}else
				odd++;
		}
		System.out.println("Number Of Even Elements Are "+even);
		System.out.println("Number Of Odd Ekements Are "+odd);
	}
}
