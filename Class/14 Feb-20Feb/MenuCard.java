

import java.io.*;
import java.util.*;

class MenuCard{
	public static void main (String...args) throws IOException{

		int loop=0;
		do{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Number For The Type Of Menu List");
			System.out.println(" 1: Integer");
			System.out.println(" 2: Character");
			System.out.println(" 3: String");
			int input=sc.nextInt();

			switch (input){
				case 1:
					System.out.println("Enter The Number Of Integers You Want To Enter");
					int in=sc.nextInt();
					int [] x=new int [in];
					System.out.println("Enter The Numbers");

					for (int i=0; i<in; i++){
						x[i]=sc.nextInt();
					}

					for(int i=0; i<in; i++){
						System.out.println(x[i]);
					}
					break;
				case 2:
					System.out.println("Enter The Number Of Character You Want To Enter");
					int in2=sc.nextInt();
					char [] ch=new char[in2];
					System.out.println("Enter The Characters You Want To Print");

					for (int i=0; i<in2; i++){
						ch[i]=sc.next().charAt(0);
					}
	
					for (int i=0; i<in2; i++){
						System.out.println(ch[i]);
					}
					break;
				case 3:
					System.out.println("Enter The Number Of String You Want To Enter");
					int in3=Integer.parseInt(br.readLine());
                        	        String [] st=new String[in3];
                                	System.out.println("Enter The String You Want To Print");

	                                for (int i=0; i<in3; i++){
        	                                st[i]=br.readLine();
                	                }
	
        	                        for (int i=0; i<in3; i++){
                	                        System.out.println(st[i]);
                        	        }
					break;
				default:
					System.out.println("Invalid Number");	

			}
			System.out.println(" If You Want To Continue Press 1 ");
			System.out.println(" If You Want To Exit Press 2");
			int repeat=sc.nextInt();
			loop=repeat;
		}
		while(loop==1);
	}
}
