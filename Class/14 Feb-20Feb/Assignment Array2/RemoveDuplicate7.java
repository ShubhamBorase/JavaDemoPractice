

import java.io.*;


class RemoveDuplicate7{
	public static void main (String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		int in=Integer.parseInt(br.readLine());
		int [] arr=new int [in];

		System.out.println("Enter The Elements Of Array");
		for (int i=0; i<in; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println();
		for (int i=0; i<in; i++){
			int flag=0;
			for (int j=i+1; j<in; j++){
				if (arr[i]==arr[j]){
					flag++;
				}
			}
			if (flag==0){
				System.out.println(arr[i]);
			}
		}
	}
}
