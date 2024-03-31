import java.io.*;
import java.util.*;

class Email{

	public Vector <String> domainSort(String [] mail){
		Vector <String> word = new Vector<String>();
		for(int i=0; i<mail.length; i++){
			String domainStr = mail[i];
			int count = mail[i].length();
			boolean flag = true;
			String strSort = "";
			for(int j=0; j<count; j++){
				if(domainStr.charAt(j)=='@'){
					flag = false;
				}
				if(flag==false){
					strSort = strSort+domainStr.charAt(j);
				}
			}

			boolean yes_no = true;

			Enumeration enu = word.elements();
			while(enu.hasMoreElements()){
				if(enu.nextElement() == strSort){
					yes_no=false;
					System.out.println("In Compare");
				}
			}
			if(yes_no == true){
				word.add(strSort);
			}
		}
		return word;
	}

	public void sendmail() throws IOException{
		Email em = new Email();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Total Number of Emails");
		int num = Integer.parseInt(br.readLine());
		String [] mail = new String [num];
		System.out.println("Enter The Emails");

		for(int i=0; i<num; i++){
			String str = br.readLine();
			mail[i] = str;
		}

		Vector<String> domains = em.domainSort(mail);

		Enumeration enu = domains.elements();
		while(enu.hasMoreElements()){
			System.out.print(enu.nextElement()+" ");
		}


	}

	public static void main(String[] args) throws IOException{
		Email em = new Email();
		em.sendmail();
	}
}