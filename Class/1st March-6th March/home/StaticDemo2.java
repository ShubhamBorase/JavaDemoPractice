


class StaticDemo2{

	static int x=10;
	static{
		x=20;
		System.out.println("In static block1");
		System.out.println(x);
	}
	public static void main(String...args){
		x=40;
		System.out.println("in main method");
		System.out.println(x);
	}
	static{
		x=30;
		System.out.println("in static block 2");
		System.out.println(x);
	}
}
