

class IfElse{
	public static void main(String[] args){
		int x = 100;

		if (x%50==0){
			System.out.println("Hundred is divisible by 50");
			if (x%20==0){
				System.out.println("Hundred is divisible by 20");
				if (x%11==1){
					System.out.println("Hundred is not divisible by 11 as it has reminder 1");
					if (x>101){
						System.out.println("Hundred is greater then 101");
					} else
						System.out.println("Hundred is Smaller than 101");
				}else
					System.out.println("Hundred is Divisible by 11");
			}
		}
		System.out.println("Main method representator");
	}
}
