class EqualEqual{

	int a = 30;
	int b = 20;
	int c = 30;

	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		EqualEqual eq = new EqualEqual();
		EqualEqual obj = new EqualEqual();

		System.out.println();

		System.out.println("Checking 2 objects of same class are equal or not using == : "+(eq==obj));
		System.out.println("Checking 2 objects of same class are equal or not using equals : "+(eq.equals(obj)));

		System.out.println();

		System.out.println("main a : "+(a));
		System.out.println("main b : "+(b));
		System.out.println("global a : "+(eq.a));
		System.out.println("global b : "+(eq.b));

		System.out.println();
		
		System.out.println("main a==b : "+(a==b));
		System.out.println("global a local a : "+(eq.a==a));
		System.out.println("global b local b : "+(eq.b==b));
		System.out.println("global a global c : "+(eq.a==eq.c));

	}
}