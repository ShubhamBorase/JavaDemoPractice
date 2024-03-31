

import java.io.*;

class EvenArray4{
        public static void main (String...args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Total Number Of Elements");
                int in=Integer.parseInt(br.readLine());
                System.out.println("Enter The Elements Of Array");

                int [] arr= new int [in];

                for (int i=0; i<in; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                for (int i=0; i<in; i++){
			if (arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
        }
}

