class HashCodePrac{
	public static void main(String[] args) {
		String str1 = "Shubh";
		String str2 = "Borase";
		String str3 = new String("Shubh");
		String str4 = new String("Shubh");
		String str5 = new String("Borase");
		String str6 = "Borase";

		System.out.println("str1 : "+(str1.hashCode()));
		System.out.println("str2 : "+(str2.hashCode()));
		System.out.println("str3 : "+(str3.hashCode()));
		System.out.println("str4 : "+(str4.hashCode()));
		System.out.println("str5 : "+(str5.hashCode()));
		System.out.println("str6 : "+(str6.hashCode()));

		System.out.println();

		str1 = "Prepare";
		str3 = new String("Prepare");
		System.out.println("str1 : "+(str1.hashCode()));
		System.out.println("str3 : "+(str3.hashCode()));

		System.out.println();

		System.out.println("str1 : "+(System.identityHashCode(str1)));
		System.out.println("str2 : "+(System.identityHashCode(str2)));
		System.out.println("str3 : "+(System.identityHashCode(str3)));
		System.out.println("str4 : "+(System.identityHashCode(str4)));
		System.out.println("str5 : "+(System.identityHashCode(str5)));
		System.out.println("str6 : "+(System.identityHashCode(str6)));

		System.out.println();
		
		str1 = "Prepare";
		str3 = new String("Prepare");
		System.out.println("str1 : "+(System.identityHashCode(str1)));
		System.out.println("str3 : "+(System.identityHashCode(str3)));

	}
}