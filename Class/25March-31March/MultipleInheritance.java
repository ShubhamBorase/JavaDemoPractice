

interface A{
	int x = 10;
}
class B{}

class C extends B{}
class D implements A{}
interface E extends A{
	int y = 10;
	System.out.println(y);
	System.out.println(x);
}
