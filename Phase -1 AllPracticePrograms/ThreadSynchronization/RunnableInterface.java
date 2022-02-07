package ThreadSynchronization;

public class RunnableInterface {
	
	//implement run method
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+ " "+Thread.currentThread().getName());
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args)
    {
    	RunnableInterface r1=new RunnableInterface();
    	RunnableInterface r2=new RunnableInterface();
    	
    	
    	Thread t1=new Thread((Runnable) r1);
    	Thread t2=new Thread((Runnable) r2);
    	
    	t1.setName("first");
    	t2.setName("Second");
    	
    	t1.start();
    	t2.start();
	
    	
    	
    }

}
