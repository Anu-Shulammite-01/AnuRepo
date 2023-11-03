import java.util.*;

class User_Register {
    private HashMap<String, String> user = new HashMap<>();

    public void register(String Username, String Password) {
        if (user.containsKey(Username)) {
            throw new IllegalArgumentException("User already exists!");
        }
        if (Username == null || Username.trim().isEmpty() || Password == null || Password.trim().isEmpty()) {
            throw new IllegalArgumentException("Username or Password can't be empty");
        } else {
            user.put(Username, Password);
        }
    }

    public boolean login(String Username, String Password){
        if(user.containsKey(Username)){
            return user.get(Username).equals(Password);
        }
        else if (Username == null || Username.trim().isEmpty() || Password == null || Password.trim().isEmpty()) {
            throw new IllegalArgumentException("Username or Password can't be empty");
        }
        else{
            throw new IllegalArgumentException("User doesn't exist, Do the registration!");
        }
    }

    public void addUser(String Username, String Password){
        register(Username, Password);
    }

    public HashMap getUser(){
        return this.user;
    }
}

class User_Registration {
    public static void main(String[] args) {
        User_Register ur = new User_Register();
        Scanner sc = new Scanner(System.in);
        ur.addUser("Anu","anu@123");
        ur.addUser("Aiden","aiden");
        try {
            System.out.println("Enter your username: ");
            String name = sc.nextLine();
            System.out.println("Enter your password: ");
            String pass = sc.nextLine();
            ur.login(name, pass);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }
        try{
            System.out.println("\nDo you want to register? Yes/No : ");
            String choice = sc.nextLine();
            if(choice.toLowerCase().startsWith("y")){
                System.out.println("Enter your username: ");
                String regName = sc.nextLine();
                System.out.println("Enter your password: ");
                String regPass = sc.nextLine();
                ur.register(regName, regPass);
                System.out.println("Registration successful!");
                ur.login(regName,regPass);
                System.out.println("Login successful!");
            }
            else if(choice.toLowerCase().startsWith("n")){
                System.out.println("Okay");
            }
            else{
                System.out.println("Invalid input! Please enter 'Yes' for Registration and 'No' for Login.");
            }
        }
        catch (IllegalArgumentException iae){
            System.err.println(iae.getMessage());
        }
        finally{
            System.out.println(ur.getUser());
        }
    }
}