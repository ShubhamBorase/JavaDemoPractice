


import java.util.*;

class Pattern9{
        public static void main(String...args){
                Scanner sc=new Scanner(System.in);
                System.out.println("No of Rows you want");
                int row=sc.nextInt();
		int n=1;
                for (int x=1; x<=row; x++){
                        for (int col=1; col<=x; col++){
                                System.out.print(n+" ");
				n++;
			}
			n--;
                        System.out.println();
                }
        }
}
