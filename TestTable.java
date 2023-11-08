import java.util.*;

class Table {
    synchronized void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

class TestTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        System.out.println("Enter another number:");
        int num2 = sc.nextInt();
        Table table = new Table();
        Thread t1 = new Thread() {
            public void run() {
                table.print(num1);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                table.print(num2);
            }
        };
        t1.start();
        t2.start();
        System.out.println("The active count is:"+Thread.activeCount());

    }
}