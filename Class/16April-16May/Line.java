import java.util.*;

class Line{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Give Integer");
		int in = sc.nextInt();

		System.out.println("Enter Double");
		double d = sc.nextDouble();

		System.out.println("Enter String");
		sc.skip("[\n\u0085]");
		String str = sc.nextLine();

		System.out.println("String :"+str);
		System.out.println("Double :"+d);
		System.out.println("Int :"+in);
	}
}