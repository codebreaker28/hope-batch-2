class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread running using thread class");
    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread running using runnable interface");
    }
}
public class ThreadExample {
    public static void main(String[] args){
        SampleThread t = new SampleThread();
        t.start(); // start the thread
        SampleThread2 t2 = new SampleThread2();
        Thread thread = new Thread(t2);// new state
        thread.start(); // start the thread
    }
    
}
