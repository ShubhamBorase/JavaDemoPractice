

class Parent{
	public void m1(){
		System.out.println("In m1 p");
		System.out.println(this+" + Parent");
	}
	Parent(){
		System.out.println("In P con");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("In C con");
	}
	public void m1(){
		System.out.println(this+" + Child");
		System.out.println("In M1 c");
	}
	public static void main(String...args){
		Child obj = new Child();
		Parent p = new Child();
		p.m1();
	}
}
