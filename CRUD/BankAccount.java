class BankAccount{
static double balance;

public static void debit(double amount){
System.out.println("debit started");
if(amount <= balance)
balance = balance - amount;
else
System.out.println("insufficient balance");

}
public static void credit(double amount){
System.out.println("credit started");
if(amount > 0)
balance = balance + amount;
else
System.out.println("amount cannot be zero");

}

public static double getAmount(){
System .out.println("feching the amount.....");
return balance;
}



}