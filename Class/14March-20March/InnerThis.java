

class Outer{
	
	int y = 20;

	class Inner{
	
		int x= 10;
	
		void m1(){
			System.out.println("In Method M1");
		}
	}

	static void m2(){
		Inner i = new Inner();
		i.m1();
		System.out.println(y);
	}

	public static void main(String...args){
		Outer.m2();
	}
}
