
import java.util.*;
class Toys{
	
	public static String sortShelf(int N, char [] ch){
		String result = "";

		Arrays.sort(ch);

		for(int i = 0; i<N; i++){
			result = result+ch[i];
		}

		return result;
	}

	public static void main(String...args){

		char [] ch = {'X','X','X','Y','Z','X','Z','Z','Y','Y','Z'};

		System.out.println(sortShelf(ch.length, ch));
	}
}