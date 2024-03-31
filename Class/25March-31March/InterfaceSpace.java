

interface Parent{

	public static final int x = 10;

	int y = 5;
	void m1();

	static void m2(){
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}

class A implements Parent{
	static {}
	int z = 1;
	public void m1(){
		System.out.println(System.identityHashCode(x));
        }

	public static void main(String...args){
		Parent p = new A();
		p.m1();
		Parent.m2();
		A p2 = new A();
		System.out.println(System.identityHashCode(p2.z));
	}
}

class B implements Parent{
	static{}
	int z = 2; 

	public void m1(){
		System.out.println(System.identityHashCode(x));
	}

        public static void main(String...args){
		Parent p1 = new B();
		p1.m1();
		Parent.m2();
		B p3 = new B();
		System.out.println(System.identityHashCode(p3.z));
        }
}

