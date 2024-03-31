


class Space121{
        public static void main(String...args){
                for (int r=1; r<=4; r++){
                        int x=r;
                        for(int c=3; c>=r; c--){
                                System.out.print(" ");
                        }
                        for(int c=1; c<=r; c++){
                                System.out.print(x--);
                        }
                        x=r;
                        System.out.println();
                }
        }
}
