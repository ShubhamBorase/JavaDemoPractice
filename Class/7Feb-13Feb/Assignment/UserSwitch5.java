import java.util.*;

class UserSwitch5{
	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter What You Want To Choose");
		System.out.println("1.Desktop");
		System.out.println("2.Laptop");

		int buy=sc.nextInt();

		switch (buy){
			case 1:
				System.out.println("Desktop");
				System.out.println("Enter The Number Of What Type Of PC You Want");
				System.out.println("1.Pre-Built PC");
				System.out.println("2.Customized PC");

				int pc=sc.nextInt();

				switch (pc){
					case 1:
						System.out.println("Pre-Built PC");
						break;
					case 2:
						System.out.println("Customized PC");
						break;
					default:
						System.out.println("You Have Entered Wrong Number");
						break;
				}
				break;

			case 2:
				System.out.println("Laptop");
				System.out.println("Enter What Type Of Laptop You Want");
				System.out.println("1.Office Book");
				System.out.println("2.Student Stuff");

                                int student=sc.nextInt();

                                switch (student){
                                        case 1:
                                                System.out.println("Office Book");
                                                break;
                                        case 2:
                                                System.out.println("Student Stuff");
                                                break;
					default:
						System.out.println("You Entered Wrong Number");
				}
				break;
			default:
				System.out.println("You Entered Wrong Number");
				break;
		}
	}
}
