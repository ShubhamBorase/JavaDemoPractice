class PatternDiamond{
	public static void main(String[] args){

		int i = 1;
		int y = 2;

		for(i=1; i<3; ){
			if(i==1){
				for(int x = 2; x>0; ){
					if(y>1){
						System.out.print("* ");
						y--;
						continue;
					}else if(y==1){
						System.out.println("* ");
						y=1;
						x--;
					}
				}
				i++;

				int j = 1;
				int k = 1;
				for(int z = 1; z<6; ){
					if(j<=((z*2)-1)){
						j++;
						if(z==k){
						System.out.print("A ");
						}
					}
					z++;
					System.out.println();
				}

			}else{
				System.out.println();
				for(int x = 1; x<3; ){
					if(y<x){
						System.out.print("* ");
						y++;
						continue;
					}else if(y==x){
						System.out.println("* ");
						y=1;
						x++;
					}
				}
				i++;
			}
		}
	}
}