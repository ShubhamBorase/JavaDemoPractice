import java.io.*;
class ISRDemo {
	public static void main(String...args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("World Cup");
		
		System.out.println("Team name");
		String team = br.readLine();
		System.out.println("Teams Name is : "+team);

		System.out.println("Group");
		char group = (char)br.read();
		System.out.println("Group is : "+group);
		br.skip(2);

		System.out.println("Ranking in ICC");
		int rank = Integer.parseInt(br.readLine());
		System.out.println("Ranking is : "+rank);
	}
}