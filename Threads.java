class Thread1 extends Thread{
    public void run(){
        for(int i = 0; i<=5;i++){
            System.out.println("Hii!");
            try {
                Thread1.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int j=0;j<5;j++){
            System.out.println("Hello");
            try {
                Thread2.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class Thread3 implements Runnable{
    public void run(){
        for(int k=0;k<5;k++){
            System.out.println("Hi there");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    } 
}
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

class Threads_Ex{
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Runnable obj1 = new Thread3();
        Thread t3 = new Thread(obj1);
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException ie){
            System.out.print(ie);
        }
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        /*t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());*/

        t3.start();

        //Using Lambda
        Runnable obj2 = () ->
        {
            for(int i = 0;i<5;i++){
                System.out.println("Lambda function called.");
            }
        };
        Thread t4 = new Thread(obj2);
        t4.start();

        //Race Condition
        
        Counter c = new Counter();
        Runnable obj3 = () ->
        {
            for(int i=0;i<100;i++){
                c.increment();
        }
        };
        Thread tr1 = new Thread(obj3);


        Runnable obj4 = () ->
        {
            for(int i=0;i<100;i++){
                c.increment();
        }
        };
        Thread tr2 = new Thread(obj4);
        tr1.start();
        tr2.start();
        try {
            tr1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        try {
            tr2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c.count);
    }
}