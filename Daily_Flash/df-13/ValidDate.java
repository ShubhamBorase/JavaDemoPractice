/*Write a Program which accepts date, month and year from
the user and checks for the validity of date according to month.
Input : 30/02/2018
Output : Date doesn’t exist!!..
*/

import java.io.*;


class DateInvalid extends Exception{
	DateInvalid(String msg){
		super (msg);
	}
}

class ValidDate{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int date = 0;
	public static int month = 0;
	public static int year = 0;
	public static boolean flag = true;

	public void date(){
		System.out.println("Enter The Date");
		try{
			date = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
			System.out.println("Stream Closed");
		}
	}

	public void month(){
		System.out.println("Enter The Month");
		try{
			month = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
			System.out.println("Stream Closed");
		}
	}
	
	public void year(){
		System.out.println("Enter The Year");
		try{
			year = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
			System.out.println("Stream Closed");
		}
	}

	public void calculator()throws DateInvalid{
		
		if((date>31)||(date<1)){
			flag = false;
			throw new DateInvalid("Entered date "+date+" is incorrect");
		}

		if((month>12)||(month<1)){
			flag = false;
			throw new DateInvalid("Entered Month "+month+" is incorrect");
		}

		if(((month==1)&&(date>31))||((month==3)&&(date>31))||((month==4)&&(date>30))||((month==5)&&(date>31))||((month==6)&&(date>30))||((month==7)&&(date>31))||((month==8)&&(date>31))||((month==9)&&(date>30))||((month==10)&&(date>31))||((month==11)&&(date>30))||((month==12)&&(date>31))){
			flag = false;
			throw new DateInvalid("Entered date "+date+" or month "+month+" is incorrect");
		}
		if((month==2)&&((date>28)&&(date<30))){
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
					}else{
						flag = false;
						throw new DateInvalid("Entered year, month or date is incorrect");
					}
				}
			}else{
				flag = false;
				throw new DateInvalid("Entered year, month or date is incorrect");
			}
		}else{
			flag = false;
			throw new DateInvalid("Entered year, month or date is incorrect");
		}
	}
	
	public static void main(String[] args){

		ValidDate vd = new ValidDate();

		vd.date();

		vd.month();

		vd.year();

		try{
			vd.calculator();
		}catch(DateInvalid di){
			di.printStackTrace();
		}

		if(flag==true){
			System.out.println("The Date "+date+"/"+month+"/"+year+" is a Valid Date");
		}else{
			System.out.println("The Date "+date+"/"+month+"/"+year+" is a Invalid Date");
			System.out.println("Try Again");
		}
	}
}