//making this project very detailed and adding some extra things

import java.util.Scanner;

class MinimumBalanceException extends Exception {
    MinimumBalanceException(String msg) {
        super(msg);
    }
}

class InvalidAccountException extends Exception {
    InvalidAccountException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class BankingService {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            if (accNo <= 0) {
                throw new InvalidAccountException(
                        "Invalid Account Number!");
            }

            System.out.print("Enter Opening Balance: ");
            double balance = sc.nextDouble();

            if (balance < 1000) {
                throw new MinimumBalanceException(
                        "Minimum balance should be Rs.1000");
            }

            System.out.print("Enter Deposit Amount: ");
            double deposit = sc.nextDouble();

            if (deposit < 0) {
                throw new InvalidAmountException(
                        "Deposit amount cannot be negative!");
            }

            balance = balance + deposit;

            System.out.print("Enter Withdrawal Amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw > balance) {
                throw new InvalidAmountException(
                        "Insufficient Balance!");
            }

            balance = balance - withdraw;

            System.out.println("\nTransaction Successful!");
            System.out.println("Account Number: " + accNo);
            System.out.println("Current Balance: Rs." + balance);
        }

        catch (InvalidAccountException e) {
            System.out.println(e.getMessage());
        }

        catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid Input! Numbers only.");
        }
    }
}