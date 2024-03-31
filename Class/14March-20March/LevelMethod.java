



class Outer{
	int i=0;
	void m1(){
		System.out.println(i);
		if(i==0){
			class Inner{
			}
		}
		class Inner{}
	}
}


class Outer1{
	void m1(){
		class Inner1{}
	}
	static void m2(){
		class Inner1{}
	}
}

class Outer2{
	void m1(){
		class Inner2{}
	}
	void m2(){
		class Inner2{}
	}
}
