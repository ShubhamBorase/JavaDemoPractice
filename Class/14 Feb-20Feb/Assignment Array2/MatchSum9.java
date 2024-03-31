

import java.io.*;


class MatchSum9{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		int in=Integer.parseInt(br.readLine());
		int [] arr=new int [in];

		System.out.println("Enter The Elements Of Array");
		for (int i=0; i<in; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter The Number Of Which Sum Is In Array");
		int num=Integer.parseInt(br.readLine());

		boolean b=false;

		for (int i=0; i<in; i++){
			for(int j=i+1; j<in; j++){
				if (num==(arr[i]+arr[j])){
					b=true;
					System.out.println("index "+i+" index "+j);
				}
			}
		}
		if(b==false){
			System.out.println("The Above Number Is Not Matching With Any Sum Of Array");
		}
	}
}
