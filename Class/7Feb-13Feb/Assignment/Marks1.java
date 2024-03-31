
import java.util.*;

class Marks1{
	public static void main(String... args){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter your marks of 5 subjects respectively here");
		
		System.out.println("Marathi");
		int Marathi=obj.nextInt();

		System.out.println("English");
                int English=obj.nextInt();

		System.out.println("Science");
                int Science=obj.nextInt();

		System.out.println("Mathmatics");
                int Mathmatics=obj.nextInt();

		System.out.println("History");
                int History=obj.nextInt();

		int total=(Marathi+English+Science+Mathmatics+History);
		System.out.println(total);

		if ((Marathi<35)||(English<35)||(Science<35)||(Mathmatics<35)||(History<35)){
			System.out.println("You are failed in Exam");
		}else{
			System.out.println("1.If total is 300-500 then press 1");
			System.out.println("2.If total is 225-299 then press 2");
			System.out.println("3.If total is 175-224 then press 3");
			
			int x=obj.nextInt();
			
			switch (x){
				case 1:
					System.out.println("Congratulations! You Received First Class Grade.");
					break;
				
				case 2:
					System.out.println("You Received Second Class Grade.");
					break;
				case 3:
					System.out.println("You Received Trird Class Grade, You can Improve Yourself.");
					break;
				default:
					System.out.println("Did You Really Passed The Exam. Because, You Even Failed To Press The Rigt Button");
			}
		}
	}
}
