
class UnitedNations{

	int Nations = 194;
	static int UNSeats = 193;
	
	void War(){
		System.out.println("No Civilian Killing");
	}
	void Nuclear(){
		System.out.println("No Nuclear Testing");
	}
}

class IndianGov extends UnitedNations{

	int Nations = 193;

	void Nuclear(){
		System.out.println("Ignore Sanction And Test the Nuke");
	}

	public static void main(String...args){
		
		UnitedNations un = new IndianGov();
		
		System.out.println(un.Nations);
		System.out.println(IndianGov.UNSeats);
		un.War();
		un.Nuclear();
	}
}
