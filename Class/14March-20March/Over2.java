


class Demo{
	
	Demo(Object obj){
		System.out.println("In Object");
	}

	Demo(String s){
		System.out.println("In String");
	}

	public static void main(String...args){
		Demo d = new Demo(null);
	}
}
