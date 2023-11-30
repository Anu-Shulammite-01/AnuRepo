import java.util.Scanner;

class Simple_Calculator{
 
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int subtract(int num1,int num2){
        return num1-num2;
    }
    public int multiply(int num1,int num2){
        return num1*num2;
    }
    public int divide(int num1,int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        } else{
            return num1/num2;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Simple_Calculator calc = new Simple_Calculator();
        //User Choice
        System.out.println("What action you wanna perform? (Add/Sub/Mul/Div): ");
        String choice = s.nextLine().toLowerCase();
        switch(choice){

            case "add":
            System.out.print("Enter first number:");
            int a=s.nextInt();
            System.out.print("Enter second number:");
            int b=s.nextInt();
            System.out.println("Result=" +calc.add(a,b));
            break;

            case "sub":
            System.out.print("Enter first number:");
            int c=s.nextInt();
            System.out.print("Enter second number:");
            int d=s.nextInt();
            System.out.println("Result=" +calc.subtract(c,d));
            break;

            case "mul":
            System.out.print("Enter first number:");
            int e=s.nextInt();
            System.out.print("Enter second number:");
            int f=s.nextInt();
            System.out.println("Result=" +calc.multiply(e,f));
            break;

            case "div":
            System.out.print("Enter numerator:");
            int g=s.nextInt();
            System.out.print("Enter denominator:");
            int h=s.nextInt();
            System.out.println("Result="+calc.divide(g,h));
            break;

            default :
            System.out.println("Invalid input!");
        }
    }
}