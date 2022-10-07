import java.util.*;
public class Main {
    Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        Bank customerOne=new AxisBank();
        customerOne.setCustomerName("Nagul");
        customerOne.setAccountNumber(2345);
        customerOne.setBalance(1000);
        Bank customerTwo=new Icici();
        customerTwo.setCustomerName("Nagul");
        customerTwo.setAccountNumber(2345);
        customerTwo.setBalance(1000);
        customerOne.deposit(122);customerOne.withdraw(2345,"Nagul",10);
        customerTwo.deposit(120);customerTwo.withdraw(2345,"Nagul",10);



    }
}
abstract class Bank
{
    int accountNumber;
    String customerName;
    int balance;
    public  void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    abstract public void deposit(int depositAmount);
    abstract public void withdraw(int accountNumber,String customerName,int withdrawAmount);
    abstract public void closeAccount(int accountNumber,String customerName);
}
class AxisBank extends Bank
{
    public void deposit(int depositAmount)
    {
        balance=balance+depositAmount;
        System.out.println("Amount is deposited");
    }
    public void withdraw(int accountNumber,String customerName,int withdrawAmount)
    {
        if(customerName.equals(this.customerName)&&accountNumber==this.accountNumber)
        {
            if(balance>withdrawAmount)
            {
                balance=balance-withdrawAmount;
                System.out.println("Amount is withdrawn");
            }
            else {
                System.out.println("Insufficient balance");
            }
        }

    }
    public void closeAccount(int accountNumber,String customerName)
    {
        System.out.println("account is closed");
    }
}
class Icici extends Bank
{
    public void deposit(int depositAmount)
    {
        balance=balance+depositAmount;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the account number");
        int accNumber=input.nextInt();
        input.nextLine();
        System.out.println("Enter the customer name");
        String cName=input.nextLine();
        if(accNumber==accountNumber&&cName.equals(customerName)){
        System.out.println("Amount is deposited");}
        else {
            System.out.println("Invalid details");
        }
    }
    public void withdraw(int accountNumber,String customerName,int withdrawAmount)
    {
        if(customerName.equals(this.customerName)&&accountNumber==this.accountNumber)
        {
            if(balance>withdrawAmount)
            {
                balance=balance-withdrawAmount;
                System.out.println("Amount is withdrawn.Thank you");
            }
            else {
                System.out.println("Insufficient balance");
                System.out.println("Thankyou");
            }
        }

    }
    public void closeAccount(int accountNumber,String customerName)
    {
        System.out.println("account is closed");
        System.out.println("Thank you");
    }
}