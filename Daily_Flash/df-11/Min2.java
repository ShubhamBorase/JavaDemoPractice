import java.io.*;

class Min2{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 1;
		int num2 = 1;

		System.out.println("Enter Two Numbers");
		
		try{
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		if(num1>num2){
			System.out.println("The Minimum Number Amongst "+num1+" And "+num2+" is "+ num2);
		}else if(num2>num1){
			System.out.println("The Minimum Number Amongst "+num1+" And "+num2+" is "+ num1);
		}else{
			System.out.println("The Numbers "+num1+" And "+num2+" are Equal ");
		}
	}
}