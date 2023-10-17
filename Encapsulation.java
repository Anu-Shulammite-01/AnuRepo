import java.util.*;

class Account {
    public String name;
    protected String email;
    private String Password;

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}

class Encapsulation {
    public static void main(String args[]) {
        Account acc1 = new Account();
        System.out.println("Enter the account details");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String email = sc.nextLine();
        String Password = sc.nextLine();
        acc1.setPassword(sc.nextLine());
        System.out.println("The Password is: " + acc1.getPassword());
    }
}