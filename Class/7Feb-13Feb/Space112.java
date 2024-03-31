




class Space112{
        public static void main(String...args){
		int x=1;
                for (int r=1; r<=4; r++){
                        for(int c=3; c>=r; c--){
				System.out.print(" ");
                        }
			for(int c=1; c<=r; c++){
                                System.out.print(x++);
			}
			x=1;
			System.out.println();
                }
        }
}

