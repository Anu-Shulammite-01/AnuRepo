class overloading {
    void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void main(String[] args) {
        overloading obj1 = new overloading();
        obj1.sum(2, 3);
        obj1.sum(1, 2, 3);
    }
}