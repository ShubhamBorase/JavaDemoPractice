import java.io.*;

class MaxNum5{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 1;
		int num2 = 1;
		int num3 = 1;

		System.out.println("Enter The Three Numbers To find Maximum Of them");

		try{
			num1 = Integer.parseInt(br.readLine());
			num2 = Integer.parseInt(br.readLine());
			num3 = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		if(num1<=num2){
			if(num2<num3){
				System.out.println("The Maximum number amongst "+num1+","+num2+" and "+num3+" is "+num3);
			}else if(num2>num3){
				System.out.println("The Maximum number amongst "+num1+","+num2+" and "+num3+" is "+num2);
			}else if(num2==num3){
				System.out.println("The Maximum number amongst "+num1+","+num2+" and "+num3+" is "+num3);
			}
		}else if(num1>num2){
			if(num1>num3){
				System.out.println("The Maximum number amongst "+num1+","+num2+" and "+num3+" is "+num1);
			}else if(num1<num3){
				System.out.println("The Maximum number amongst "+num1+","+num2+" and "+num3+" is "+num3);
			}else if(num1==num3){
				System.out.println("The Maximum number amongst "+num1+","+num2+" and "+num3+" is "+num3);
			}
		}
	}
}