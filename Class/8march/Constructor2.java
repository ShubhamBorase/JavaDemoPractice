


class Demo{
        int x=10;
        Demo(){
                this(i);
		System.out.println("In This");
		System.out.println(this.x);
        }
	Demo(int x){
		System.out.println("in demo int");
	}
	public static void main(String...args){
		Demo obj=new Demo();
		System.out.println("In Main");
	}
}
