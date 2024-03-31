

class Parent{
	Parent(){
		System.out.println("In Constructor Of Parent");
	}
	void m1(){
		System.out.println("In Method M1");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("In Constructor Of Child");
	}
	void m2(){
		System.out.println("In method m2");
	}
}

class Demo{
	public static void main(String...args){
		Parent p = new Parent();
		p.m1();

		Child c = new Child();
		c.m1();
		c.m2();

		Parent p1 = new Child();
		p1.m1();
		//p1.m2 cant be accesed from parent p1=new Child(); as there is no m2 method present in parent
	}
}
