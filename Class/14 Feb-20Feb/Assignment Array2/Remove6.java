

import java.io.*;

class Remove6{
	public static void main (String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		int in=Integer.parseInt(br.readLine());
		int [] arr=new int [in];

		System.out.println("Enter The Numbers");
		for (int i=0; i<in; i++){
			arr [i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter The Element You Want To Remove");
		int remove=Integer.parseInt(br.readLine());
		System.out.println();

		for (int i=0; i<in; i++){
			if (arr[i]!=remove){
				System.out.println(arr[i]);
			}
		}
	}
}
