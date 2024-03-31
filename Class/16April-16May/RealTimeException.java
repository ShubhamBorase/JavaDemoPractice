

class GasEmpty extends Exception{
	GasEmpty(String msg){
		super(msg);
	}
}
class CookerFault extends Exception{
	CookerFault(String msg){
		super(msg);
	}
}

class Cooking extends Thread{

	boolean gasPoli = false;
	boolean pressureRice = false;
	boolean gasCurry = true;

	void poli() throws GasEmpty{
		System.out.println("Making Poli");
		if(gasPoli==false){
			throw new GasEmpty("Gas is exhausted completely");
		}
	}

	void rice() throws CookerFault{
		System.out.println("Rice is in the cooker to boil");
		if(pressureRice==false){
			throw new CookerFault("The Pressure Cooker is not tight hence has leaking Vapours");
		}
	}

	void curry() throws GasEmpty{
		System.out.println("Some Delicious Curry is on the Gas");
		if(gasCurry==false){
			throw new GasEmpty("Gas is exhausted completely");
		}
	}

	public void run(){
		
		if(Thread.currentThread().getName().equals("Cooker")){
			try{
				rice();
			}catch(CookerFault cf){
				cf.printStackTrace();
				System.out.println("Order from Hotel");
			}
		}

		if(Thread.currentThread().getName().equals("Burner")){
			try{
				curry();
			}catch(GasEmpty ge1){
				ge1.printStackTrace();
				System.out.println("Order from Hotel");
			}
		}

		if(Thread.currentThread().getName().equals("roll")){
			try{
				poli();
			}catch(GasEmpty ge2){
				ge2.printStackTrace();
				System.out.println("Order from Hotel");
			}
		}
	}

	public static void main(String[] args) {
		
		Cooking c1 = new Cooking();
		c1.setName("Cooker");
		c1.start();

		Cooking c2 = new Cooking();
		c2.setName("Burner");
		c2.start();

		Cooking c3 = new Cooking();
		c3.setName("roll");
		c3.start();
	}
}