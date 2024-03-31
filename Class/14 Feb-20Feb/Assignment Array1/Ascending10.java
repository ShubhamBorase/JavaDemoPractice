

import java.io.*;

class Ascending10{
	public static void main (String...args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Total Number Of Arrays");
		int num=Integer.parseInt(br.readLine());
		int [] arr=new int [num];
		System.out.println("Enter The Elements Of Array");

		for (int i=0; i<num; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int temp;
		int maxx=0;
		for (int i=0; i<num; i++){
			for (int j=i+1; j<num; j++){
				if (arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i=0; i<num; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
