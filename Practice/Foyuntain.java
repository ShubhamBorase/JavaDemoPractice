
class Fountain{
	public static void main(String...args){
		int input = 5;
		int val = 1;
		boolean flag = true;

		for(int row=0; row<input; row++){
			for(int col=0; col<input; col++){
				if(row == col){
					System.out.print(val+" ");
				}else if((row+col)==input-1){
					System.out.print(val+" ");
				}else{
					System.out.print("  ");
				}
				if(row==col && row+col==input-1){
					flag = false;
				}
			}
			System.out.println();
			if(flag == true){
				val++;
			}else{
				val--;
			}
		}
	}
}