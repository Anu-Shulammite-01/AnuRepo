class Thread_E extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Welcome to Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}

class Thread_E1 extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Programming!");
        }
    }
}

class Thread_Example {
    public static void main(String[] args) {
        Thread_E t1 = new Thread_E();
        Thread_E1 t2 = new Thread_E1();
        //start thread1
        t1.start();
        //thread1 interrupt
        t1.interrupt();
        try {
            t1.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }

        //start thread2
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println("The main thread waited for the Thread2.");
    }
}