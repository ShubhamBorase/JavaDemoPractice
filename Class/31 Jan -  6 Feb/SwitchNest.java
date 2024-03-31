

class SwitchNest{
	public static void main(String[] args){

		System.out.println("1.Desktop");
		System.out.println("2.Laptop");

		int buy = 2;

		switch (buy){
			case 1:
				System.out.println("Desktop");

				System.out.println("1.Pre-Built PC");
				System.out.println("2.Customized PC");

				int pc = 3;

				switch (pc){
					case 1:
						System.out.println("Pre-Built PC");
						break;
					case 2:
						System.out.println("Customized PC");
						break;
				}
				break;

			case 2:
				System.out.println("Laptop");

				System.out.println("1.Office Book");
				System.out.println("2.Student Stuff");

                                int student = 2;

                                switch (student){
                                        case 1:
                                                System.out.println("Office Book");
                                                break;
                                        case 2:
                                                System.out.println("Student Stuff");
                                                break;
				}
				break;
		}
	}
}
