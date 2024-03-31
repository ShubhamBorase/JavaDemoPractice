

class Outer{
	
	Outer(){
		System.out.println("In Constructor of Outer");
		System.out.println(this);
	}
	
	static int x=10;
	
	class Inner{

		Inner(){
			System.out.println("In Constructor of Inner");
			System.out.println(this);
			System.out.println(x);
		}
	}
}

class Demo{

	public static void main(String...args){
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
	}
}
