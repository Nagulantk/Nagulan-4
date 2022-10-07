public class Main {
    public static void main(String[] args) {

        ATM customerOne=new ATM();
        customerOne.setAccountNumber(1234);
        customerOne.setPin(9876);
        customerOne.setBalance(10000);
        customerOne.withdrawAmount(1234,9876,1000);
        ICICIAtm customerTwo=new ICICIAtm();
        customerTwo.setAccountNumber(4567);
        customerTwo.setPin(4981);
        customerTwo.setBalance(5555);
        customerTwo.withdrawAmount(4567,4981,110);
        customerTwo.depositAmount(4567,4981,5000);

    }
}
class ATM
{
    int accountNumber;

    int pin;
    int balance;
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void getBalance(int accountNumber,int pin) {
        if(this.accountNumber==accountNumber&&this.pin==pin){
        System.out.println(this.balance);
        }
        else {
            System.out.println("Invalid details");
        }

    }
    public void withdrawAmount(int accountNumber,int pin,int amount)
    {  if(this.accountNumber==accountNumber&&this.pin==pin){
        if(amount<balance)
        {
            balance=balance-amount;
            System.out.println("Amount is withdrawn");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    else {
        System.out.println("Invalid details");
    }

    }
}
class ICICIAtm extends ATM
{
    public void depositAmount(int accountNumber,int pin,int amount)
    {
        if(this.accountNumber==accountNumber&&this.pin==pin)
        {
            balance=balance+amount;
            System.out.println("Amount is deposited");
        }
        else {
            System.out.println("Invalid details");
        }
    }
}