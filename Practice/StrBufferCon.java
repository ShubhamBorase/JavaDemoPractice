class StrBufferCon{
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Shubham");
		StringBuffer sb3 = new StringBuffer(100);
		StringBuffer sb4 = new StringBuffer(200);
		StringBuffer sb5 = new StringBuffer("A");
		StringBuffer sb6 = new StringBuffer("B");
		StringBuffer sb7 = new StringBuffer("C");
		StringBuffer sb8 = new StringBuffer("D");

		System.out.println("sb1 : "+(sb1));
		System.out.println("sb2 : "+(sb2));
		System.out.println("sb3 : "+(sb3));
		System.out.println("sb4 : "+(sb4));

		System.out.println();

		System.out.println("sb1 : "+(sb1.capacity()));
		System.out.println("sb2 : "+(sb2.capacity()));
		System.out.println("sb3 : "+(sb3.capacity()));
		System.out.println("sb4 : "+(sb4.capacity()));
		System.out.println("sb5 : "+(sb5.capacity()));
		System.out.println("sb6 : "+(sb6.capacity()));
		System.out.println("sb7 : "+(sb7.capacity()));
		System.out.println("sb8 : "+(sb8.capacity()));
	}
}