



import java.util.*;

class Multiple1{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. from which you want to start the Table");
		int x=sc.nextInt();
		System.out.println("Enter the limit at which you want to stop the Table");
		int y=sc.nextInt();
		for (int i=x; i<=y; ){
			System.out.print(i+" ");
			i=i+x;
		}
	}
}
