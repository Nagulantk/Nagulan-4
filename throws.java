import java.util.*;
public class Main {
    public static void main(String[] args) {
        ATM user1 = new ATM();

        try {

            user1.settingAccountNumber();
            user1.settingPin();

        } catch (InputMismatchException e) {
            System.out.println("Enter the account number and pin in numbers");
        }
    }
}
class ATM
{
    int accountNumber;
    int pin;

    public void settingAccountNumber() throws InputMismatchException{
        Scanner input = new Scanner(System.in);
        System.out.println("enter the account number");
        this.accountNumber = input.nextInt();
    }
    public void settingPin() throws InputMismatchException
    {Scanner input = new Scanner(System.in);
        System.out.println("enter the pin");
        this.pin=input.nextInt();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }
}