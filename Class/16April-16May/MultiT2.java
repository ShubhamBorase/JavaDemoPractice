
class JoinDemo extends Demo implements Runnable{

	Thread T = new Thread(obj);

	public void run(){
		
		System.out.println("Child Wants Main");
		
		d.join();
		
		for(int i = 0; i<25; i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){}

			System.out.println("Child Thread");
		}
	}
}

class Demo{
	public static void main(String[] args) throws InterruptedException{

		Demo d = new Demo();
		JoinDemo obj = new JoinDemo();
		obj.join();
		obj.start();

		for(int i = 0; i<25; i++){
			Thread.sleep(500);
			System.out.println("Main Thread");
		}
	}
}