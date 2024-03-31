
class JoinDemo extends Thread{
	
	public void run(){
		
		for(int i = 0; i<10; i++){
			
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){}

			System.out.println("Child Thread");
		}
	}
}

class Demo{
	public static void main(String[] args) throws InterruptedException{

		JoinDemo obj = new JoinDemo();
		obj.join();
		obj.start();

		for(int i = 0; i<10; i++){

			Thread.sleep(500);

			System.out.println("Main Thread");
		}
	}
}