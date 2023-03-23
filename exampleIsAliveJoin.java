//exampleIsAliveJoin.java
class NewThread implements Runnable{
	String name; // name of thread
	Thread thread;
	NewThread(String threadName){
		name=threadName;
		thread=new Thread(this, name);
		System.out.println("New Thread: "+ thread);
	}
	// This is the entry point of thread.
	public void run(){
		try{
			for(int i=5; i>0; i--){
				System.out.println(name + " : "+ i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e){
			System.out.println(name + " interrupted. ");
		}
		System.out.println(name + " exiting...");
	}
}// end of class  NewThread
class exampleIsAliveJoin {
	public static void main(String[] args){
		NewThread nt1=new NewThread("One");
		NewThread nt2=new NewThread("Two");
		NewThread nt3=new NewThread("Three");
		
		// Start the Thread
		nt1.thread.start();
		nt2.thread.start();
		nt3.thread.start();
		
		System.out.println("Thread One is alive :" + nt1.thread.isAlive());
		System.out.println("Thread One is alive :" + nt2.thread.isAlive());
		System.out.println("Thread One is alive :" + nt3.thread.isAlive());
		
		// wait for threads to finish
		try{
			System.out.println("Waiting for threads to finish...");
			nt1.thread.join();
			nt2.thread.join();
			nt3.thread.join();
		} catch (InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Thread One is alive :" + nt1.thread.isAlive());
		System.out.println("Thread One is alive :" + nt2.thread.isAlive());
		System.out.println("Thread One is alive :" + nt3.thread.isAlive());
		
		System.out.println("Main thread exiting....");
	}// end of main function
}// end of class exampleIsAliveJoin 
