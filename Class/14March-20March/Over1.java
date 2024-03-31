

class Demo{
	
	Demo(String s){
		System.out.println("String");
	}
	
	Demo(StringBuffer sb ){
		System.out.println("String Buffer sb");
	}

	public static void main(String...args){
		Demo d = new Demo(null);
	}
}
