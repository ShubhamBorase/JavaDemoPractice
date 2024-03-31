class Keys extends Exception{
	Keys(String str){
		super(str);
	}
}

class Vehicle extends Thread{
	
	void driving() throws Keys{
		System.out.println("Ready to leave for office");
		throw new Keys("Keys of vehicle not found");
	}

	public void run(){
		driving();
	}

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
	}
}