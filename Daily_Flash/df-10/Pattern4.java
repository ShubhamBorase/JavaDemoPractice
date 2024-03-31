import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in = 1;

		System.out.println("Enter The Number of Rows");
		try{
			in = Integer.parseInt(br.readLine());
		}catch(IOException io){}

		int col = 1;
		for(int row = 1; row<=in; ){
			if(col<row){
				if(row%2==1){
					System.out.print("a ");
					col++;
					continue;
				}else{
					System.out.print("A ");
					col++;
					continue;
				}
			}else if(col==row){
				if(row%2==1){
					System.out.print("a ");
					System.out.println();
					row++;
					col = 1;
				}else {
					System.out.print("A ");
					System.out.println();
					row++;
					col = 1;
				}
			}
		}
	}
}