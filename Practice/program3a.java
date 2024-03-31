//SHREE

class Core2web {
	public static void plang(){
		System.out.println("Java Programming");
	}
}

class Biencaps{
	public static void project(){
		System.out.println("Java coding");
	}
	public static void main(String[] args) {
		System.out.println("Start tutorial");
		//for calling method project
		project();
		//for calling method plang in another class
		Core2web.plang();
		System.out.println("End Tutorial");
	}
}