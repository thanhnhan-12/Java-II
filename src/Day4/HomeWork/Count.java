package Day4.HomeWork;

public class Count {
	
	//method not synchronized
	synchronized void printNumber(int n){  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }
		     catch(Exception e)
		     {System.out.println(e);}  
		   }  
		  
		 }  
	public static void main(String[] args) {
		// synchronize
		Count c=new Count();
		Thread1 t1=new Thread1(c);
		Thread2 t2=new Thread2(c);
		t1.start();
		t2.start();
		

	}

}
