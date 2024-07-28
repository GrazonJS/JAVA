import java.util.Scanner;

public class savingsAcoount extends bankAccount {
    double balance;
    double minimum_balance=500;
    savingsAcoount(String Accno,int intrestRate){
        super(Accno, intrestRate);

    }

    public double withdraw(double amount){
    this.balance= super.balance;
        if(this.balance<minimum_balance){
        System.out.println("Insufficient balance "+  this.balance);
        return 0;
        }
        else{
        this.balance-=amount;
        return this.balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bank Details");
        System.out.println("Enter account no and interest rate");
        bankAccount bacc=new bankAccount(sc.nextLine(), sc.nextInt());
        System.out.println("enter the deposit amount:");
        System.out.println(bacc.deposit(sc.nextDouble()));
        System.out.println("enter account no and interest rate");
        savingsAcoount sacc=new savingsAcoount(sc.nextLine(), sc.nextInt());
        System.out.println("enter the amount to deposit");
        System.out.println(sacc.deposit(sc.nextDouble()));
        System.out.println("enter the amount to withdraw");
        System.out.println(sacc.withdraw(sc.nextDouble()));
    }

}
