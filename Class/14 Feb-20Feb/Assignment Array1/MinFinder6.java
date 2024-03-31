

import java.io.*;

class MinFinder6{
        public static void main (String...args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Total Number Of Elements");
                int in=Integer.parseInt(br.readLine());
                System.out.println("Enter The Elements Of Array");
                int [] arr= new int [in];
		int min=0;
		int max=0;
                for (int i=0; i<in; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                for (int i=0; i<in; i++){
			if (arr[i]>max){
				max=arr[i];
				min=max;
			}
                        if (arr[i]<min){
                                min=arr[i];
                        }
                }
                System.out.println("Minimum Number Present In Array Is "+min);
        }
}

