//synchronizationUsingMethod.java
import java.lang.*;
class Table{  
	synchronized void printTable(int n){//method  synchronized  
		for(int i=1;i<=5;i++){  
			System.out.println(n + "*"+ i + "=" + n*i);  
			try{  
				Thread.sleep(100);  
			}catch(InterruptedException e){
				System.out.println(e);
			}  
		}  
	}  
}  
class MyThreadFirst extends Thread{  
	Table t;  
	MyThreadFirst(Table t){  
		this.t=t;}  
	public void run(){  
		t.printTable(10); }	  
} // end of class MyThreadFirst
class MyThreadSecond extends Thread{  
	Table t;  
	MyThreadSecond(Table t){  
		this.t=t; }  
	public void run(){  
		t.printTable(100); }  
}// end of class MyThreadSecond
  
class synchronizationUsingMethod{  
	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThreadFirst t1=new MyThreadFirst(obj);  
		MyThreadSecond t2=new MyThreadSecond(obj);  
		t1.start();  
		t2.start();  
	}  
} // end of class synchronizationUsingMethod
