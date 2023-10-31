import java.io.*;
class Exception_Ex{
    public static void main(String[] args){
        //ArrayIndexOutOfBoundsException
        try{
            int numArray[] = {1,2,3,4};
            System.out.println(numArray[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Caught an Array Index Out of Bounds exception");
        }

        //Arithematic Exception
        int num1=0;
        int num2=7;
        try{
            int result=num2/num1;
        }
        catch (ArithmeticException ex){
            System.out.println("Division by zero is not allowed.");
        }

        //Null Pointer Excdeption
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch (NullPointerException npe){
            System.out.println("You are trying to access a null string.");
        }

        //try with resources
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(br.readLine());
            System.out.println("The entered number is: "+num);
        }
        catch (IOException ioe){
            System.out.println("IO Error occured while reading the input from user.");
        }

        //try with finally
        boolean flag = true;
        try{
            if(flag) throw new ArithmeticException();
        }
        catch (ArithmeticException ex){
            System.out.println("An arithmetic error has occurred.");
        }
        finally{
            System.out.println("This block will always execute whether there was an exception or not.");
        }

        
            
    }
    //using throw
    static void checkAge(int age){
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Invalid Age");
        }
        else if(age < 18) {
            throw new ArithmeticException("You must be 18 years old");
        }
        else{
            System.out.println("Valid Age");
        }
    }
}