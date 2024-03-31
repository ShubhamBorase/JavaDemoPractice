

class Mall{
	
	int x=10;
	static int y=20;

	void m1(){
		System.out.println("In Methood m1 Mall");
	}

	class Shop{
		
		int x=30;

		void m1(){
			System.out.println("In Method m1 Shop");
		}
	}

	static void m2(){
		System.out.println("In Method m2 Mall");
	}
}

class Demo{
	public static void main(String...args){
		Mall m = new Mall();
		Mall.Shop s = m.new Shop();
	}
}
