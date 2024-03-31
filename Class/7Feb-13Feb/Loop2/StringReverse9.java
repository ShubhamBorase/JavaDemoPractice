


import java.util.*;

class StringReverse9{
        public static void main(String...args){

                Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter The String In Form Of Number Only To Reverse It");
		String str = sc.nextLine();

		int x = Integer.parseInt(str);

		int temp=x;
		int sum=0;
		while (temp!=0){
			int rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		System.out.println(sum+" ");
	}
}
