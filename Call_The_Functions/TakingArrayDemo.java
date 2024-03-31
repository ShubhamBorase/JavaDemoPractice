
import java.io.*;
import media.stunning.New Volume.Programming.Java.DS in Java.*;

public class TakingArrayDemo{
	public static void main(String...args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Total Number of Elements in Array");
		int count = Integer.parseInt(br.readLine());

		System.out.println("Enter the numbers");
		long[] arr = new long[count];

		for(int i=0; i<count; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		MergeSortDemo md = new MergeSortDemo();

		md.merging(arr, 0, arr.length-1);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}