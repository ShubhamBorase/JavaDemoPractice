/*
Write a Program to Print following Pattern.

7
7	6
6	5	4
4	3	2	1

*/

import java.io.*;

class Pattern4{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = 0;

		try{
			row = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int num = 7;
		int y = 0;

		for(int x = 0; x<row; ){
			if(y<x){
				System.out.print(num+" ");
				num--;
				y++;
				continue;
			}
			x++;
			y = 0;
			System.out.print(num+" ");
			System.out.println();
		}
	}
}