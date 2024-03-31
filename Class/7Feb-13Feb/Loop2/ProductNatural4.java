


import java.io.*;

class ProductNatural4{
        public static void main (String...args) throws IOException{
                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

                System.out.println("Enter Lower Limit");
                // lower limit is represented by ll
                int ll=Integer.parseInt(br.readLine());

                System.out.println("Enter Upper Limit");
                // upper limit is represented by ul
                int ul=Integer.parseInt(br.readLine());

                int pro=1;
                for (int start=ll; start<=ul; start++){
                        if (start>=1){
                                pro=pro*start;
                        }
                }
                System.out.println("Product of above Natural Numbers is "+ pro);
        }
}

