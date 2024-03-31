

import java.io.*;


class SearchString1{
	public static void main (String...args)throws IOException{
		
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter The Total Number Of Strings");
		int in= Integer.parseInt(br.readLine());
		String [] st=new String[in];
		System.out.println("Enter The Strings");

		for (int i=0; i<in; i++){
			st[i]=br.readLine();
		}

		System.out.println("Enter The String Your Want To Find");
		String find=new String(br.readLine());
		for (int i=0; i<in; i++){
			if (find.compareTo(st[i])==0){
				System.out.println(" The String Was Found at Array Index"+ i);
				break;
			}
		}
	}
} 
