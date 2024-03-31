import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int z=Integer.parseInt(br.readLine());
		int x=0,h=0;
		int flag=0;
		for (int i=1;i<=z;i++){
		    StringTokenizer st = new StringTokenizer(br.readLine()," ");  
            while (st.hasMoreTokens()){
            	if (flag==0){
            		x=Integer.parseInt(st.nextToken());
            		flag++;
            	}else{
            		h=Integer.parseInt(st.nextToken());
            	}
            }
            flag = 0;
            //System.out.println(x+" "+h);
            if(x>=h){
            	System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
		}
	}
}