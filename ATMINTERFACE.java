/* author:michael josil m
   title:atminterface
   uses:used to save time for people
 */



import java.util.Scanner;
//create a class for the methods
public class ATMINTERFACE {


    public static void main(String[] args) {
        //declare and initialize balance, withdraw, and deposit
        String user;
        int password;
        int passwords;
        int withdraw, deposit;


        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name:");
        user = sc.nextLine();

        switch (user) {

            case "mich": {
                passwords = 1234;

                System.out.println("Enter password:");
                password = sc.nextInt();
                if (passwords == password) {
                    System.out.println("you are ready to go:");
                    int balance = 50000;


                    System.out.println("Enter (1) for Withdraw");
                    System.out.println("Enter (2) for Deposit");
                    System.out.println("Enter (3) for Check Balance");
                    System.out.println("Enter (4) for EXIT");
                    System.out.print("Choose the operation you need to perform:");

                    //get choice from user
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter money to be withdrawn:");

                            //get the withdrawl money from user
                            withdraw = sc.nextInt();

                            //check whether the balance is greater than or equal to the withdrawal amount
                            if (balance >= withdraw) {
                                //remove the withdrawl amount from the total balance
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                                System.out.println("Thank you");
                                System.exit(0);
                            } else {
                                //show custom error message
                                System.out.println("Insufficient Balance");
                                System.out.println("please deposit money");
                                System.exit(0);
                            }
                            System.out.println("");



                        case 2:

                            System.out.print("Enter money to be deposited:");

                            //get deposite amount from te user
                            deposit = sc.nextInt();

                            //add the deposit amount to the total balanace
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully depsited");
                            System.out.println("");
                            System.out.println("Thank you");
                            System.exit(0);


                        case 3:
                            //displaying the total balance of the user
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                            System.out.println("Thank you");
                            System.exit(0);


                        case 4:
                            //exit from the menu
                            System.exit(0);



                    }
                    break;


                } else {
                    System.out.println("wrong password:");
                    System.exit(0);
                }
                break;

            }
            case "josil": {
                passwords = 5678;

                System.out.println("Enter password:");
                password = sc.nextInt();
                if (passwords == password) {
                    System.out.println("you are ready to go:");
                    int balance = 20000;


                    System.out.println("Enter 1 for Withdraw");
                    System.out.println("Enter2 for Deposit");
                    System.out.println("Enter 3 for Check Balance");
                    System.out.println("Enter 4 for EXIT");
                    System.out.print("Choose the operation you need to perform:");

                    //get choice from user
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter money to be withdrawn:");

                            //get the withdrawl money from user
                            withdraw = sc.nextInt();

                            //check whether the balance is greater than or equal to the withdrawal amount
                            if (balance >= withdraw) {
                                //remove the withdrawl amount from the total balance
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                                System.out.println("Thank you");
                                System.exit(0);
                            } else {
                                //show custom error message
                                System.out.println("Insufficient Balance");
                                System.out.println("please deposit money");
                                System.exit(0);
                            }
                            System.out.println("");


                        case 2:

                            System.out.print("Enter money to be deposited:");

                            //get deposite amount from te user
                            deposit = sc.nextInt();

                            //add the deposit amount to the total balanace
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully depsited");
                            System.out.println("");
                            System.out.println("Thank you");
                            System.exit(0);


                        case 3:
                            //displaying the total balance of the user
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                            System.out.println("Thank you");
                            System.exit(0);


                        case 4:
                            //exit from the menu
                            System.exit(0);


                    }
                    break;


                } else {
                    System.out.println("wrong password:");
                    System.exit(0);
                }

                break;

            }
            case "harish": {
                passwords = 9012;


                System.out.println("Enter password:");
                password = sc.nextInt();
                if (passwords == password) {
                    System.out.println("you are ready to go:");
                    int balance = 30000;


                    System.out.println("Enter 1 for Withdraw");
                    System.out.println("Enter2 for Deposit");
                    System.out.println("Enter 3 for Check Balance");
                    System.out.println("Enter 4 for EXIT");
                    System.out.print("Choose the operation you need to perform:");

                    //get choice from user
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter money to be withdrawn:");

                            //get the withdrawl money from user
                            withdraw = sc.nextInt();

                            //check whether the balance is greater than or equal to the withdrawal amount
                            if (balance >= withdraw) {
                                //remove the withdrawl amount from the total balance
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                                System.out.println("Thank you");
                                System.exit(0);
                            } else {
                                //show custom error message
                                System.out.println("Insufficient Balance");
                                System.out.println("please deposit money");
                                System.exit(0);
                            }
                            System.out.println("");


                        case 2:

                            System.out.print("Enter money to be deposited:");

                            //get deposite amount from te user
                            deposit = sc.nextInt();

                            //add the deposit amount to the total balanace
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully depsited");
                            System.out.println("");
                            System.out.println("Thank you");
                            System.exit(0);


                        case 3:
                            //displaying the total balance of the user
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                            System.out.println("Thank you");
                            System.exit(0);


                        case 4:
                            //exit from the menu
                            System.exit(0);


                    }


                    break;

                } else {
                    System.out.println("wrong password:");
                    System.exit(0);
                }
                break;


            }
            default: {
                System.out.println("invalid user name:");
                System.out.println("Enter a registered user name:");
                System.exit(0);
            }

        }
    }
}
/* The conditions are made in a simple flow manner the repeation of the conditons are made in certain place where need as like real world scnerio
 */
