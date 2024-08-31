package Xenosis_Internship.Assignment2.Q2;

public class BankAccount {
    public int accno;
   public double balance;
   BankAccount(int accno,double balance){
       this.accno  = accno;
       this.balance = balance;
   }
   public void displayBalance(){
       System.out.println("Balance is : "+balance);
   }
   public void deposite(double amount){
       if(amount > 0 ){
           balance = balance + amount;
           System.out.println("Amount deposited successfully : "+amount);
           System.out.println("Now balance is : "+balance);
       }else{
           System.out.println("Amount cannot deposited !!");
       }
   }

   public void withdraw(double amount){
       if(amount > 0 && balance >0){
           balance = balance - amount;
           System.out.println("Amount withdraw successfully : "+ amount );
           System.out.println("Now balance is : "+balance);
       }else{
           System.out.println("Amount cannot withdrawn!!");
       }
   }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1,5000);
        bankAccount.displayBalance();
        bankAccount.deposite(2000);
        bankAccount.withdraw(1000);
    }



}
