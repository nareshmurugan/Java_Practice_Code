package mutithread_Pro;
public class ThreadDemo implements Runnable {
    Object t=Thread.currentThread().getName();
    public void run() {
        
        for(int counter=1;counter<=100;counter++){
            System.out.println((t).getClass().getSimpleName()  +"thread is running..."+counter);
    }
}
    public static void main(String args[]) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread t1 = new Thread(threadDemo,"First");
        Thread t2 = new Thread(threadDemo,"Second");
        t1.start();
        t2.start();
    }
}
