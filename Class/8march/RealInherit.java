

class Parent{

	int a=10;
	static int b=20;
	
	Parent(){
		System.out.println("In Parent Constructor");
		System.out.println(a);
		System.out.println(b);
		System.out.println(this);
	}
}

class Child1 extends Parent{

	int c=30;
	static int d=40;
	Parent obj2= new Parent();
	a=60;
	Child1(){
		System.out.println("In Child1 Constructor");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(this);
	}
}

class Child2 extends Parent{

	int e=50;
	static int f=60;


	Child2(){
		System.out.println("In Child2 Construct");
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		System.out.println(f);
		System.out.println(this);
		System.out.println(this);
	}
}

class Main{
	public static void main(String...args){
		Child2 obj = new Child2();
		System.out.println("In Main Class");
	}
}

class Main2{
	public static void main(String...args){
		Child1 obj1=new Child1();
		Child2 obj2=new Child2();
		System.out.println("In Main 2");
	}
}
