import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public Bank() {
        System.out.println("System has started!");
    }
    public void runApp() {
        ArrayList<Account> accounts = new ArrayList<>() ;
        Scanner scanner = new Scanner(System.in) ;
        int choice=0 ;
        int i=0 ;
        while (choice != 8) {
            System.out.println("Menu:");
            System.out.println();
            System.out.println("1. Create account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Update an account");
            System.out.println("4. Delete an account");
            System.out.println("5. Deposit an amount to account");
            System.out.println("6. Withdraw an amount from your account");
            System.out.println("7. Search for account");
            System.out.println("8. Exit");

            choice=scanner.nextInt();

            if (choice == 1) {
                Scanner nscan=new Scanner(System.in);
                System.out.println("Welcome to account creation. Enter your information to create account:");
                System.out.println("Enter your name:");
                String name= nscan.nextLine();
                System.out.println("Enter your phone number:");
                String number= nscan.nextLine();
                System.out.println("Enter your gender:");
                String gender= nscan.nextLine();
                System.out.println("Enter your age:");
                int age= nscan.nextInt();
                nscan.nextLine();
                System.out.println("Enter account type:");
                String type= nscan.nextLine();
                System.out.println("Date of creation:");
                String date = nscan.nextLine() ;

                Account account = new Account() ;
                account.createAccount(i,type,date,name,number,gender, age);
                accounts.add(account);
                i++ ;


            }
            if (choice==2) {
                int flag = 0 ;
                System.out.println("Enter your phone number:");
                scanner.nextLine();
                String phone = scanner.nextLine();

                for (Account account : accounts) {
                    if (account.phoneNumber.equals(phone)) {
                        account.displayAccount();
                        flag=1;
                    }
                }
                if (flag == 0) {
                    System.out.println("Sorry! No account found.");
                }
            }

            if (choice==3) {
                System.out.println("Enter your account number:");
                scanner.nextLine();
                int num = scanner.nextInt();
                if (num < i) {
                    System.out.println("What do you want to update?");
                    System.out.println("1. Name");
                    System.out.println("2. Phone number");
                    System.out.println("3. Both");
                    scanner.nextLine();
                    int temp = scanner.nextInt();

                    if (temp==1) {
                        System.out.println("Enter name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        accounts.get(num).changeName(newName) ;
                    }

                    if (temp==2) {
                        System.out.println("Enter number:");
                        scanner.nextLine();
                        String newNumber = scanner.nextLine();
                        accounts.get(num).changeNumber(newNumber) ;
                    }

                    if (temp==3) {
                        System.out.println("Enter name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        System.out.println("Enter number:");
                        scanner.nextLine();
                        String number=scanner.nextLine();

                        accounts.get(num).changeName(newName);
                        accounts.get(num).changeNumber(number);
                    }
                }else {
                    System.out.println("Sorry no account found!");
                }



            }

            if (choice==4) {
                System.out.println("Enter account number to delete:");
                scanner.nextLine();
                int num = scanner.nextInt() ;
                if (num < i) {

                System.out.println("The account: "+num + " has been removed!");

                accounts.remove(num) ;
                }else {
                    System.out.println("Sorry no account found!");
                }


            }

            if (choice == 5) {
                System.out.println("Enter your account number to deposit:");
                scanner.nextLine();
                int num = scanner.nextInt();
                if (num < i) {
                    accounts.get(num).displayAccount();
                    System.out.println("Enter deposit amount: ");
                    scanner.nextLine();
                    int amount=scanner.nextInt();
                    accounts.get(num).balance+=amount ;
                    System.out.println("After deposit your current balance: "+ accounts.get(num).balance);
                }else {
                    System.out.println("Sorry no account found!");
                }


            }

            if (choice == 6) {
                System.out.println("Enter your account number to withdraw:");
                scanner.nextLine();
                int num = scanner.nextInt();
                if (num < i) {
                    accounts.get(num).displayAccount();
                    System.out.println("Enter withdraw amount: ");
                    scanner.nextLine();
                    int amount=scanner.nextInt();
                    if (accounts.get(num).balance-amount < accounts.get(num).minAmount) {
                        System.out.println("You can not withdraw your money! Withdraw limit exceed!");
                    }else {

                        accounts.get(num).balance-=amount ;
                    }
                    System.out.println("After withdraw your current balance: "+ accounts.get(num).balance);
                }else {
                    System.out.println("Sorry no account found!");
                }


            }

            if (choice==7) {
                System.out.println("Enter your account number:");
                scanner.nextLine();
                int num = scanner.nextInt();
                if (num<i) {
                accounts.get(num).displayAccount();

                }else {
                    System.out.println("Sorry no account found!");
                }
            }

        }
    }
}
