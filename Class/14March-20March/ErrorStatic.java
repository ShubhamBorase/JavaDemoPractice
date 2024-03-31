


class Outer{
	int x = 10;
	class Inner1{
		int x = 20;
		class Inner2{
			int x = 30;
			void m1(){
				System.out.println(this.x);
				System.out.println(this.(Inner1.x));
				System.out.println(Outer.x);
			}
		}
	}

	public static void main(String...args){
		Outer o = new Outer();
		Outer.Inner1 i1 = o.new Inner1();
		Inner1.Inner2 i2 = i1.new Inner2();
	}
}
