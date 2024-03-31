import java.io.*;

class Cube2{
        public static void main(String...args){

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Upto which Number You want to Print the Square");

                int num = 0;

                try{
                        num = Integer.parseInt(br.readLine());
                }catch(IOException io){
                        System.out.println("Error");
                }

                for(int i = 1; i<=num; i++){
                        System.out.println("Cube of "+i+" : "+ i*i*i);
                }
        }
}
