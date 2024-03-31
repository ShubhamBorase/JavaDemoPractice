
import java.io.*;

class Pythya1{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//Stream created

		int side1 = 1;									//Declaring and Initiolising
		int side2 = 1;									//Three Sides of Triangle
		int side3 = 1;

		System.out.println("Give The Measurment of Sides of Right angle Triangle");
		try{										//Try catch block for Exception
			side1 = Integer.parseInt(br.readLine());				//Taking Input for all sides
			side2 = Integer.parseInt(br.readLine());
			side3 = Integer.parseInt(br.readLine());
		}catch(IOException io){
			System.out.println("System Error");
		}finally{									//finally block to close the stream
			try{
				br.close();
			}catch(IOException io1){
				System.out.println("Can't close the stream");
			}
		}

		side1 = side1*side1;
		side2 = side2*side2;
		side3 = side3*side3;

		int a = side1+side2;
		int b = side2+side3;
		int c = side1+side3;
		// According to Pythyagorus Theorm, In a right angled triangle (side1*side1)+(side2*side2)=(Hypotenious*hypotenious)
		if(side1==b){
			System.out.println("Triangle Satisfies the Pythagorean Theorem");
		}else if(side2==c){
			System.out.println("Triangle Satisfies the Pythagorean Theorem");
		}else if(side3==a){
			System.out.println("Triangle Satisfies the Pythagorean Theorem");
		}else
			System.out.println("Triangle doesnt Satisfies the Pythagorus Theorem");
	}
}
