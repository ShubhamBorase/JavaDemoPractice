



import java.io.*;

class MaxxFinder5{
        public static void main (String...args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter The Total Number Of Elements");
                int in=Integer.parseInt(br.readLine());
                System.out.println("Enter The Elements Of Array");
		int [] arr= new int [in];

		int maxx=0;
                for (int i=0; i<in; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                for (int i=0; i<in; i++){
			if (arr[i]>maxx){
				maxx=arr[i];
			}
		}
		System.out.println("Maximum Number Present In Array Is "+maxx);
        }
}

