class Petrol extends Exception{
	Petrol(String str){
		super(str);
	}
}

class Vehicle extends Thread{
	
	void driving()throws Petrol{
		System.out.println("On the Road");
		throw new Petrol("Petrol Tank Empty");
	}

	public void run(){
		System.out.println("Left for office");
		try{
			driving();
		}catch(Petrol p){
			p.printStackTrace();
		}
	}

	public static void main(String[] args){
		Vehicle t = new Vehicle();
		t.start();
	}
}