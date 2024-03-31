

import java.io.*;

class SumNatural3{
        public static void main (String...args) throws IOException{
                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

                System.out.println("Enter Lower Limit");
                // lower limit is represented by ll
                int ll=Integer.parseInt(br.readLine());

                System.out.println("Enter Upper Limit");
                // upper limit is represented by ul
                int ul=Integer.parseInt(br.readLine());

		int sum=0;
                for (int start=ll; start<=ul; start++){
                        if (start>=1){
				sum=sum+start;
			}
		}
		System.out.println("Sum of above Natural Numbers is "+ sum);
	}
}

