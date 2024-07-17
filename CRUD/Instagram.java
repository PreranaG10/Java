class Instagram{
static String name;
static String phoneNum;
static String emailId;
static String pwd;
static String confirmPwd;
public static boolean createInstaAccount(String userName,String phoneNumber,String email,
    String password,String confirmPassword)
{
boolean isAccountCreated=false;
boolean isuserNameValid=false;
boolean isphoneNumberValid=false;
boolean isemailValid=false;
boolean isPasswordValid=false;
boolean isconfirmPasswordValid=false;


if(userName != null){
   name = userName;
   isuserNameValid = true;
   }else{
   System.out.println("please provide valid userName");
   }
   
 if(phoneNumber != null){
    phoneNum=phoneNumber;
	isphoneNumberValid = true;
	}else{
	System.out.println("please provide valid phoneNumber");
	}
	
	
if(email != null){
   emailId=email;
   isemailValid=true;
   }else{
   System.out.println("please provide valid email");
   }
   
 if(password  != null){
     pwd=password;
	 isPasswordValid=true;
	 }else{
	 System.out.println("please provide valid password");
	 }
	 
if(confirmPassword != null){
   confirmPwd=confirmPassword;
   isconfirmPasswordValid=true;
   }else{
   System.out.println("please provide valid confirmPassword");
   }
   
 return isAccountCreated;
 }
 
 public static void readInstagram(){
 
System.out.println("userName is :" +name);
System.out.println("phoneNumber is :" +phoneNum);
System.out.println("email is :" +emailId);
System.out.println("password is :" +pwd);
System.out.println("confirmPassword is :" +confirmPwd);
}
}

 
