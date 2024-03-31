

import java.io.*;

class Merge5{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		int in1=Integer.parseInt(br.readLine());
		int [] arr1= new int [in1];

		System.out.println("Enter The Elements In Array");
		for (int i=0; i<in1; i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter The Size Of Second Array");
                int in2=Integer.parseInt(br.readLine());
                int [] arr2= new int [in2];

		System.out.println("Enter The Elements In Second Array");
		for (int j=0; j<in2; j++){
			arr2[j]=Integer.parseInt(br.readLine());
		}

		int temp=in1+in2;
		int [] tem=new int[temp];
		for(int i=0; i<in1; i++){
			for(int j=0; j<in2; j++){
				for (int k=0; k<temp ; k++){
					if (arr1[i]!=arr2[j]){
						tem[k]=arr1[i];
					}
					if (arr2[j]!=arr1[i]){
						tem[k]=arr2[j];
					}
				}
			}
		}
		for (int k=0; k<temp; k++){
                        System.out.println(tem[k]+" ");
                }
	}
}
