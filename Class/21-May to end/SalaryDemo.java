
import java.io.*;
import java.util.*;

class Wilmar{

	String name;
	String cmpName;
	Float sal;

	Wilmar(String name, String cmpName, float sal){
		this.name = name;
		this.cmpName = cmpName;
		this.sal = sal;
	}
}

class SalaryDemo{

	int num = 0;

	float val1 = 0;
	float val2 = 0;
	float val3 = 0;

	int index ;

	String name = null;
	String cmpName = null;
	float sal = 0;

	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Wilmar> al = new ArrayList<Wilmar>();
		SalaryDemo sl = new SalaryDemo();
		Iterator en = al.iterator();

		System.out.println("Enter The Number Of Employees");
		
		try{
			sl.num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = 0; i<sl.num; i++){
			try{
				System.out.println("Enter The Name Of Employee");
				sl.name = br.readLine();

				System.out.println("Enter The Name Of Company");
				sl.cmpName = br.readLine();

				System.out.println("Enter The Annual Package");
				sl.sal = Float.parseFloat(br.readLine());
					
				al.add(new Wilmar(sl.name, sl.cmpName, sl.sal));

			}catch(IOException ie1){
				ie1.printStackTrace();
			}
			if(sl.sal>sl.val1){
				sl.val3 = sl.val2;
				sl.val2 = sl.val1;
				sl.val1 = sl.sal;
			}else if(sl.sal>sl.val2){
				sl.val3 = sl.val2;
				sl.val2 = sl.sal;
			}else if(sl.sal>sl.val3){
				sl.val3 = sl.sal;
			}
		}

		sl.cal();
	}
}
