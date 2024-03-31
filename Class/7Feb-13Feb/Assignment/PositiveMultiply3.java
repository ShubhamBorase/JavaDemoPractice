

import java.util.*;

class PositiveMultiply3{
	public static void main(String...args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The First Number");
		int num1=sc.nextInt();
		System.out.println("Enter The Second Number");
		int num2=sc.nextInt();

		int flag=1;
		if ((num1>0)&&(num2>0)){
			int num3=num1*num2;
			System.out.println("The Multiplication of Above Number is "+num3);
			if (num3%2==0){
				flag++;
			}
			switch(flag){
				case 1:
					System.out.println("Above Number Is Odd");
					break;
				default:
					System.out.println("Above Number Is Even Number");
			}
		}else {
			System.out.println("Sorry Negative Numbers And Neutral i.e. Zero Are Not Allowed");
		}
	}
}
