class Exception_Ex2 {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 0;
        try{
            int result = num1 / num2;
        }
        catch (ArithmeticException e){
            System.out.println("Error: " + e);
        }
    }

    static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}