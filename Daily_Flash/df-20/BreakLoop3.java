/*
Write a Program that accepts 10 integers from the user and breaks
the loop of accepting numbers if the user enters a negative number. {Note: Use
Break Statement}
Input: 1 2 3 4 -6
Output: Negative Number Entered, Exiting The Loop!
*/

import java.io.*;

class BreakLoop3{

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		for(int i = 0; i<10; i++){
			try{
				num = Integer.parseInt(br.readLine());
			}catch(IOException ie){
				ie.printStackTrace();
			}
			if(num<0){
				System.out.println("Negative Number Entered, Exiting The Loop!");
				break;
			}
		}
	}
}