import java.util.*;

class DemoHash{

	void hashmath(){
		System.out.println(hashCode());
		System.out.println(hashCode());
		System.out.println(hashCode());
		System.out.println(hashCode());
	}
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(12);
		hs.add(8);
		hs.add(16);
		hs.add(20);

		DemoHash dh = new DemoHash(12);

		dh.hashmath();
		System.out.println(hs);
		System.out.println();	
	}
}