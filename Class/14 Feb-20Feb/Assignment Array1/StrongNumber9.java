import java.io.*;

class StrongNumber9{
        public static void main (String...args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Total Numbers You Want To Enter");
		int row = Integer.parseInt(br.readLine());
		int [] x = new int [row];
		System.out.println("Enter The Numbers");

		for (int i=0; i<row; i++){
			x [i] = Integer.parseInt(br.readLine());
		}

		for (int i=0; i<row; i++){
			int sum=0;
			int temp=x[i];
			int rem=0;

			while(temp!=0){
				rem=temp%10;
				int multi=1;

				for (int rem1=rem; rem1>0; rem1--){
					multi=multi*rem1;
				}
				sum=sum+multi;
				temp=temp/10;
			}
			if (sum==x[i]){
				System.out.println(x[i]+" is a Strong Number");
			}
			x[i]=temp;
		}
	}
}
