

class Out{
	
	int x=10;
	
	class In{
		
		void m1(){
			System.out.println(this);
		}
	}

	static void m2(){

		Out obj1 = new Out(obj1);
		In obj = obj1.new In();
		obj.m1();
	}
	public static void main(String...args){
		Out.m2();
	}
}
