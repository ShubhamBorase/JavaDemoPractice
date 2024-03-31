import java.io.*;

class Average{

	public double minMax(int [] num){
		double flag = num[0];
		double flag2 = num[0];
		double flag3 = 0;
		double flag4 = 0;
		double amount = 2;
		for(int i=1; i<num.length; i++){
			if(flag>num[i]){
				flag = num[i];
			}else if(flag==num[i]){
				flag3=flag;
				amount++;
			}
			if(flag2<num[i]){
				flag2 = num[i];
			}else if(flag2==num[i]){
				flag4 = flag2;
				amount++;
			}
		}
		System.out.println(flag+" "+flag2+" "+flag3+" "+flag4);
		System.out.println(amount);
		double aver = (flag+flag2+flag3+flag4)/amount;
		return aver;
	}
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Number Of Elements");

		int count = Integer.parseInt(br.readLine());
		int [] num = new int [count];

		for(int i=0; i<count; i++){
			num[i] = Integer.parseInt(br.readLine());
		}

		Average av = new Average();
		double aver = av.minMax(num);
		System.out.println("The Average is "+aver);
	}
}