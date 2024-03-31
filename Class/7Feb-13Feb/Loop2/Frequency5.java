import java.io.*;

class Frequency5{
	public static void main (String...args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter The Number");
		int num=Integer.parseInt(br.readLine());
		
		//Temperary store num in temp
		int temp=num;

		for (int digit=0; digit<10; digit++){
			int count=0;
			while(num!=0){
				int rem=num%10;
				if (rem==digit){
					count++;
				}
				num=num/10;
			}
			if (count!=0){
				System.out.println("Frequency of "+digit+" is "+count);
			}
			num=temp;
		}
	}
}
