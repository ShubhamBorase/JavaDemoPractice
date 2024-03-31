



class Pattern1BC{
        public static void main(String...args){
		int x=1;
                char y='A';
                for (int r =1; r<=5; r++){
                        for (int c=1; c<=r; c++){
                                if (r%2==0){
                                        System.out.print(y);
					x++;
                                }else
                                        System.out.print(x++);
					y++;
                        }
                        System.out.println();
                }
        }
}
