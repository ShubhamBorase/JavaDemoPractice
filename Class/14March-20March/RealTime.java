

class India{
	
	float Population = 1.4f;
	
	static String Nationality = "Indian";

	static{
		System.out.println("Self Defence");
	}

	India(){
		System.out.println("IT sector");
	}

	India(String attack){
		System.out.println("Indian Army");
	}

	class ForeignPolicy{
		
		int mig29=30;

		ForeignPolicy(){
			System.out.println("Neutral Stand On America and Russia");
		}

		ForeignPolicy(String issue){
			System.out.println("Turkey must Respect UNSC resolution on Cyprus");
		}

		void Kashmir(){
			System.out.println("Hamara he");
		}

	}

	void Pharmacy(){
		System.out.println("50% Vaccine Manufacturing Nation");
	}

	static void NatoRounds(){
		System.out.println("Production of Nato Rounds");
	}

	public static void main(String...args){
		India o = new India("Attack on India");
		System.out.println(o.Population);
		System.out.println(India.Nationality);
		o.Pharmacy();
		India.NatoRounds();
		India.ForeignPolicy i = o.new ForeignPolicy("Cyprus");
		System.out.println(i.mig29);
		i.Kashmir();
	}
}
