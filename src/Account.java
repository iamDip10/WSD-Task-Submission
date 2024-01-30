public class Account {
    String accountType ;
    int accountNumber;
    String creationDate;
    float balance;
    String name;
    String phoneNumber;
    String gender;
    int age;
    int minAmount;

    public Account() {
        System.out.println("Creating your account...");
    }
    public void createAccount(int accountNumber, String accountType, String creationDate, String name, String phoneNumber, String gender, int age) {
        this.accountType = accountType;
        this.creationDate = creationDate;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.accountNumber=accountNumber;

        if (accountType.equals("Saving Account")){
            this.balance=200;
            minAmount=200;
        }else if (accountType.equals("Current Account")) {
            this.balance=300;
            minAmount=300;
        }else if (accountType.equals("Salary Account")) {
            this.balance=400;
            minAmount=400;
        }else if (accountType.equals("Student Account")){
            this.balance=100;
            minAmount=100;
        }

        System.out.println("Your account has been created!");

    }

    public void displayAccount() {
        System.out.println("Account Number: "+this.accountNumber+ ", Account Holder: "+ this.name+  ", Account type: "+this.accountType + ", Creation date: "+this.creationDate+", Current Balance: "+this.balance );
    }

    public void changeName(String name) {
        this.name=name ;
    }
    public void changeNumber(String number) {
        this.phoneNumber=number ;
    }
}
