/*
Write a Program to Convert entered Decimal Number to
Hexadecimal Number
Input: Decimal Number: 43
Output: Hexadecimal Number: 2B
*/

class DecimalToHexa2{

	public static void calculator(int num){
		
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter The Decimal Number");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		calculator(num)
	}
}