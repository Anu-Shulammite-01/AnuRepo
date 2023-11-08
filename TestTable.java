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
        int num = sc.nextInt();
        Table table = new Table();
        Thread t1 = new Thread() {
            public void run() {
                table.print(num);
            }
        };
        t1.start();

    }
}