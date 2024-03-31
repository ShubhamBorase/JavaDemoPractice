

class Outer{
	
	class Inner{
	
		void m1(){
			System.out.println("In Method M1");
			System.out.println(this);
		}
	}

	void m2(){
		System.out.println("In Method M2");
		System.out.println(this);
		Inner i1 = new Inner();
		i1.m1();
	}
	public static void main (String...args){
		
		Outer o1 = new Outer();
		Outer o2 = new Outer();
		System.out.println("Calling M1 from o1");
		o1.m2();
		System.out.println("Calling M1 from o2");
		o2.m2();
	}
}
