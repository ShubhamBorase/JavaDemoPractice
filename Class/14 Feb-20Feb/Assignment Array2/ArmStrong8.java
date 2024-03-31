

import java.io.*;


class ArmStrong8{
	public static void main (String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Size Of Array");
		int in=Integer.parseInt(br.readLine());
		int [] asn=new int [in];

		System.out.println("Enter The Elements");
		for(int k=0; k<in; k++){
			asn[k]=Integer.parseInt(br.readLine());
		}

		for (int k=0; k<in; k++){
		
			int temp=asn[k];
			int sum=0;
			int count=0;
			int x=0;
			int total=1;
	
			while(temp!=0){
				temp=temp/10;
				count++;
			}
	
			temp=asn[k];
	
			int [] arr=new int [count];
			
			for (int i=0; i<count; i++){
				int rem=temp%10;
				arr[i]=rem;
				temp=temp/10;
			}
	
			for (int i=0; i<count; i++){
				for (int j=0; j<count; j++){
					total=total*arr[i];
				}
				sum=sum+total;
				total=1;
			}
			
			if (sum==asn[k]){
				System.out.println(asn[k]+" Is A Armstrong Number");
			}else
				System.out.println(asn[k]+" Is Not A Armstrong Number");
		}
	}
}
