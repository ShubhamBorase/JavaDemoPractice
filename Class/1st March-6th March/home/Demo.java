class Demo{
	
	String str1="Core2Web";
	static String str2=new String("Core2Web");
	String master3="Core";
	void method1(){
		System.out.println("In method1");
		String master2="Core";
		String str3="Core2Web";
		System.out.println(str3);
		str3=str3.replace("2Web","");
		System.out.println(str3);
		System.out.println(str1==str3);
		String str4=new String("Core2Web");
		System.out.println(master3==master2);
	}
	static void method2(){
		String str5="Core2Web";
        	String str6=new String("Core2Web");
	}
	public static void main(String ... args){
		Demo obj=new Demo();

		String master="Core";

		System.out.println("In main Method");
		System.out.println("Before changing str1");
		System.out.println(obj.str1);
		System.out.println(obj.str1.hashCode());
		System.out.println(System.identityHashCode(obj.str1));

		obj.str1=obj.str1.replace("2Web","");
		String str1new=obj.str1;

		System.out.println(str1new);

		System.out.println("After changing str1");
		System.out.println(obj.str1);
		System.out.println(obj.str1.hashCode());
		System.out.println(System.identityHashCode(obj.str1));

		System.out.println(obj.str1==str1new);
		System.out.println(obj.str1==master);

		obj.method1();
		obj.method2();
	}
}


