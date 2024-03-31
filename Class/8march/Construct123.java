class Parent{
	static int y=34; 
        static{
	
		System.out.println("In Static Parent");
	}
}
class Child extends Parent{
        static int y=34;
	static {
		
	
       
                System.out.println("In Child");
        }
}
class Main{
	public static void main(String...ar){
		
	System.out.println(Child.y);
	}
        
     
}

