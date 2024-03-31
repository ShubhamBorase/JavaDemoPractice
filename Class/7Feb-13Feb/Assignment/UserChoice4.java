
import java.util.*;


class UserChoice4{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("What's your Interest ");
		System.out.println("1.Movies");
		System.out.println("2.Series");

		int choice=sc.nextInt();

		switch (choice){
			case 1:
				System.out.println("Movies You Wish To Watch Today");

				System.out.println("1.Founder");
				System.out.println("2.Snowden");
				System.out.println("3.Jobs");
				System.out.println("4.Her");
				System.out.println("5.Social Network");
				System.out.println("6.Wall-E");

				int movie=sc.nextInt();

				switch (movie){
					case 1:
						System.out.println("Founder");
						break;
					case 2:
						System.out.println("Snowden");
						break;
					case 3:
						System.out.println("Jobs");
						break;
					case 4:
						System.out.println("Her");
						break;
					case 5:
						System.out.println("Social Network");
						break;
					case 6:
						System.out.println("Wall-E");
						break;
					default:
						System.out.println("Lets Watch Founder");
						break;
				}
				break;

			case 2:
				System.out.println("Best Series To Watch");

				System.out.println("1.Silicon Vally");
				System.out.println("2.Devs");
				System.out.println("3.The IT Crowed");
				System.out.println("4.Mr Robot");
                                
				int series=sc.nextInt();

                                switch (series){
                                        case 1:
                                                System.out.println("Silicon Vally");
                                                break;
                                        case 2:
                                                System.out.println("Devs");
                                                break;
					case 3:
						System.out.println("The IT Crowed");
						break;
					case 4:
						System.out.println("Mr Robot");
						break;
					default:
						System.out.println("Resuming Silicon Valley");
				}
				break;
		}
	}
}
