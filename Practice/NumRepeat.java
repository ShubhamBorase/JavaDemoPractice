import java.io.*;

class NumRepeat{
 
    // Main driver method
    public static void main(String[] args)throws IOException{
 
        // Creating an object of BufferedReader class
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 
        // Custom integer array of size 10
        int num[] = new int[10];
        // Array of string type to store input
        String[] strNums;
 
        // Display message
        System.out.println("enter string of numbers");
 
        // Reading input a string
        strNums = br.readLine().split(" ");
    }
}