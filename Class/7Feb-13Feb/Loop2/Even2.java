

import java.io.*;

class Even2{
        public static void main (String...args) throws IOException{
                BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

                System.out.println("Enter Lower Limit");
                // lower limit is represented by ll
                int ll=Integer.parseInt(br.readLine());

                System.out.println("Enter Upper Limit");
                // upper limit is represented by ul
                int ul=Integer.parseInt(br.readLine());

                for (int start=ll; start<=ul; start++){
                        if (start%2==0){
                                System.out.print(start+", ");
                        }
                }
        }
}

