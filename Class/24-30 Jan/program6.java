class Lab{
	int HCl = 0;            //Non-Static variable
	static int H2O = 1;     //Static Variable

	//Static Method
	
	static void Drinking(){
		System.out.println("Drinking Water");
	}

	//Non-Static Method
	
	void Practicle(){
		System.out.println("Performing Practicle");
	}

	public static void main (String[] args){

		System.out.println(H2O);
		Drinking();

		Lab Permission = new Lab();

		System.out.println(Permission.HCl);
		Permission.Practicle();
	}
}
