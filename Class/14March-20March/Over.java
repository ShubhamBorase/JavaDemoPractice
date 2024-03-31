


class Parent{
	void marry(){
		System.out.println("In Class Parent");
	}
}

class Child extends Parent{
	void marry(){
		System.out.println("In Child Class");
	}
}

class Demo{
	public static void main(String...args){
		Parent p = new Child();
		p.marry();
	}
}
