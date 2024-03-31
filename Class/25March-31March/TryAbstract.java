

class Parent{
	void m1(){
		System.out.println("M1");
	}
}

class Child extends Parent{
	void m2(){
		System.out.println("M2");
	}
}

class Demo{
	public static void main (String...args){
		Parent p = new Child();
		p.m1();
		p.m2();
	}
}
