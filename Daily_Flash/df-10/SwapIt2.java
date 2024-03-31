import java.io.*;

class SwapIt2{
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr1 = 1;
		int arr2 = 1;

		System.out.println("Enter Two Numbers To Swap");

		try{
			arr1 = Integer.parseInt(br.readLine());
			arr2 = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		System.out.println("Before Swap "+arr1+" "+arr2);

		int arr3 = arr2;
		arr2 = arr1;
		arr1 = arr3;

		System.out.println("After Swap "+arr1+" "+arr2);
	}
}