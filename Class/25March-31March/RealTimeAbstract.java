

abstract class Father{

	void Property(){
		System.out.println("2 Flats in Pune");
	}

	void Job(){
		System.out.println("Retired from post of TC");
	}

	abstract void HomeLoan();
}

class ElderSon extends Father{
	
	void Job(){
		System.out.println("Working in HAL");
	}

	void Property(){
		System.out.println("A Flat in Pune");
	}

	void HomeLoan(){
		System.out.println("Pay The Loan");
	}
}

class YoungerSon extends Father{

	void Studing(){
		System.out.println("Studing in DU");
	}
	void Property(){
		System.out.println("A Flat in Pune");
	}

	void HomeLoan(){
		System.out.println("RePay Loan Later");
	}
}

class Savkaar{

	public static void main(String...args){
		
		Father b = new ElderSon();
		b.Job();
		b.Property();
		b.HomeLoan();

		Father y = new YoungerSon();
		y.Property();
		y.HomeLoan();
	}
}
