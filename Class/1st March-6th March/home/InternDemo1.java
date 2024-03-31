

class InternDemo1{
	public static void main(String...args){
		String str1="Core2Web";
		System.out.println(System.identityHashCode(str1));
		String str2=new String("Core2Web");
		System.out.println(System.identityHashCode(str2));
		str2=str2.intern();
		System.out.println(System.identityHashCode(str2));
	}
}
