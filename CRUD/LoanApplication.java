class LoanApplication{
static String accountNo;
static String nameOfBank;
static int creditScoreNo;
static double intrest;
static String Type; 
public static boolean getLoan(String accountNumber,String bankName,int creditScore,double rateOfIntrest,String loanType)
{
boolean isLoancreated=false;
boolean isaccountNumberValid=false;
boolean isbankNameValid=false;
boolean iscreditScoreValid=false;
boolean israteOfIntrestisValid=false;
boolean isloanTypeValid=false;
boolean isgetLoanCreated=false;

if(accountNumber != null){
	accountNo = accountNumber;
	isaccountNumberValid=true;
    }else{
	System.out.println("please provide valid accountNumber");
    }


if(bankName != null){
   nameOfBank = bankName;
   isbankNameValid=true;
   }else{
   System.out.println("please provide valid username");
   }
   
if(creditScore > 0){
   creditScoreNo = creditScore;
   iscreditScoreValid=true;
   }else{
   System.out.println("please provide valid creditScore");
   }
   
if(rateOfIntrest > 0.0){
   intrest = rateOfIntrest;
   israteOfIntrestisValid=true;
   }else{
   System.out.println("please provide valid rateOfIntrest");
   }
   
if(loanType != null){
   Type = loanType; 
   isloanTypeValid=true;
   }else{
   System.out.println("please provide valid loanType");
   }
   isgetLoanCreated=true;
   
return isgetLoanCreated;
}

public static void readLoanApplication(){
System.out.println("accountNumber is :" +accountNo);
System.out.println("bankName is :" +nameOfBank);
System.out.println("creditScore is :" +creditScoreNo);
System.out.println("rateOfIntrest is :" +intrest);
System.out.println("loanType is :" +Type);
}
}