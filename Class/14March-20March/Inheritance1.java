

class Parent{

	int x=10;

	static int y=20;

	static{
		System.out.println("In static block of Parent");
	}

	{
		System.out.println("In Instance Block of Parent");
	}

	Parent(){
		System.out.println("In null Constructor Of Parent");
	}

	Parent(int x){
		System.out.println("In Parameterised Constructor Of Parent");
	}

	void m1(){
		System.out.println("In Instance Method of Parent");
	}

	static void m2(){
		System.out.println("In Static Method Of Parent");
	}
}

class Child{
	public static void main(String...args){
		Parent obj=new Parent();
		obj.m1();
		Parent.m2();
	}
}

