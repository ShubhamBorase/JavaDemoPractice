import java.io.*;

class OctalNum2{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int binary = 0;

		System.out.println("Enter The Binary Numbers");

		try{
			binary = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int count = 0;
		int sum = 0;
		int num = 0;
		int temp = binary;

		boolean flag = true;

		while(temp != 0){
			num = temp%10;
			
			if((num == 1)||(num == 0)){
				sum = sum*10+num;
			}else{
				System.out.println("Enter The Valid Binary Number");
				flag = false;
				break;
			}

			temp = temp/10;
			count++;
		}

		if(count%3==1){
			sum = sum*10*10;
			count = count+2;
		}else if(count%3==2){
			sum = sum*10;
			count++;
		}

		int rum = count/3;

		int [][] arr = new int [rum][3];

		/*if(flag == true){
			for(int i = 0; i<rum; i++){
				for(int j = 0; j<3; j++){
					int in = sum%10
					arr[i][j] = in
				}
			}
		}*/

		int samvat = 0;
		int gum = 0;
		int round = 1;

		if(flag==true){
			while(round <= count){
				int vikram = 0;
				for(int i = 0; i<3; i++){
					samvat = sum%10;
					vikram = (vikram*10)+samvat;
					sum = sum/10;
				}
				switch(vikram){
					case 1:
						gum = gum*10+1;
						break;
					case 10:
						gum = gum*10+2;
						break;
					case 11:
						gum = gum*10+3;
						break;
					case 100:
						gum = gum*10+4;
						break;
					case 101:
						gum = gum*10+5;
						break;
					case 110:
						gum = gum*10+6;
						break;
					case 111:
						gum = gum*10+7;
						break;
					default:
						gum = gum*10+0;
						break;
				}
				round = round+3;
			}
			System.out.println("Binary Number : "+binary);
			System.out.println("Octal Number : "+gum);
		}
	}
}