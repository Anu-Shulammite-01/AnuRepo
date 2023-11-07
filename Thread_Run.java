class Thread1_Ex implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}
class Thread2_Ex implements Runnable{
    public void run(){
        for (int i=0 ;i<5;i++){
            System.out.println("Bye");
        }
    }
}

class Thread_Run{
    public static void main(String[] args){
        Runnable obj1 = new Thread1_Ex();
        Runnable obj2 = new Thread2_Ex();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}