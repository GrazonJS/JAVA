public class bankAccount {
    String Accno;
    double balance=0;
    int intrestRate;
    double amount;
    bankAccount(String Accno,int intrestRate){
        this.Accno=Accno;
        this.intrestRate=intrestRate;
    }
    double deposit(double amount){
        this.amount=amount;
        this.balance =balance+amount;
        return this.balance;
    }
}
