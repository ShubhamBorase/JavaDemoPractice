



import java.util.*;

class FrequencyArray8{
	public static void main (String...args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Total Number Of Element In Matrix");
		int row=sc.nextInt();
		System.out.println("Enter The Members Of Matrix");
		int [] arr=new int [row];
		int [] arr2=new int [row];
		int count=-1;
		int flag=0;
		for (int y=0; y<row; y++){
				arr [y]=sc.nextInt();
			}
	
		for (int digit=0; digit<row; digit++){
			flag=0;
			for (int y=digit; y<row; y++){

				if (arr[y]==arr[digit]){
					flag++;
				}
			}			
			if (flag!=0){
				System.out.println("Frequency of "+arr[digit]+" is "+flag);
			}
		}
	}
}

