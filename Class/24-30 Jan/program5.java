//Shree

class Smartphone{
	int iPhone= 90000;
	static int Samsung= 70000;

	void iPhonePrice (){
		System.out.println("The cost of iPhone in Rs is");
	}

	static void SamsungPrice(){
		System.out.println("The cost of Samsung in Rs is");
	}

	public static void main(String[] args){
		SamsungPrice();
		System.out.println(Samsung);

		Smartphone obj1 = new Smartphone();

		obj1.iPhonePrice();
		System.out.println(obj1.iPhone);
	}
}
