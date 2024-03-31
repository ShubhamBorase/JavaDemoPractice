class ThreadDemo{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Thread t = new Thread();
		t.start();
		t.run();

		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo2 extends Thread{

	public void run(){
		for (int i = 0; i<100; i++) {
			System.out.println("In Run");
		}
	}

	public static void main(String[] args) {
		Thread obj = new Thread(new ThreadDemo2());
		obj.start();

		for (int i = 0; i<100; i++) {
			System.out.println("In Start");
		}
	}
}

class ThreadDemo3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("In Run thread: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadDemo3());
        t1.setName("Thread-1"); // Set a meaningful name for identification

        t1.start(); // Start the thread

        for (int i = 0; i < 100; i++) {
            System.out.println("In Main thread: " + Thread.currentThread().getName());
        }
    }
}
