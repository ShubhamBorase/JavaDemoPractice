




class Pattern1AB{
        public static void main(String...args){
                int x=1;
                char y='A';
                for (int r =1; r<=4; r++){
                        for (int c=1; c<=r; c++){
                                if (r%2==0){
                                        System.out.print(y++);
                                }else
                                        System.out.print(x++);
                        }
                        System.out.println();
                }
        }
}

