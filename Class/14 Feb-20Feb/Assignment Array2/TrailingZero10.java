

import java.io.*;


class TrailingZero10{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Number");
		int in=Integer.parseInt(br.readLine());

		int temp=in;
		int count=0;
		int flag=0;
		int num=0;
		int infor=0;
		int jog=0;

		while (temp!=0){
			temp=temp/10;
			count++;
		}
		temp=in;

		int [] arr=new int [count];
		for (int i=0; i<count; i++){
			int rem=temp%10;
			arr[i]=rem;
			temp=temp/10;
		}
		temp=in;

		for(int i=0; i<count; i++){
                        if (arr[i]==0){
				for (int j=i+1; j<count; j++){
					if(arr[j]==0){
						break;
					}else
						infor++;
				}
			}
		}

		for(int i=0; i<count; i++){
			if (arr[i]==0){
                                num=1;
                       	        for (int j=i+1; j<count; j++){
					if(arr[j]!=0){
						break;
					}else
						num++;
				}
			}
			if(num>flag){
				flag=num;
			}
		}
/*
		for(int k=0; k<infor; k++){
			if(arr1[k]>flag){
				flag=arr1[k];
		}*/
		System.out.println("The Number Of Trailing Zeros Is "+flag);
	}
}
