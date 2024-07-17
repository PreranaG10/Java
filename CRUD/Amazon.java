class Amazon{
static String fName;
static String contactNo;
static String emailId;
static String pwd;
public static boolean SignIn(String fullName,String contactNumber,String email,String password)
{
boolean isSignInCreated=false;
boolean isfullNameValid=false;
boolean iscontactNumberValid=false;
boolean isemailValid=false;
boolean ispasswordValid=false;

if(fullName != null){
   fName=fullName;
   isfullNameValid=true;
   }else{
   System.out.println("please provide valid fullName");
   }
   
if(contactNumber != null){
   contactNo=contactNumber;
   iscontactNumberValid=true;
   }else{
   System.out.println("please provide valid contactNumber");
   }
   
if(email != null){
   emailId=email;
   isemailValid=true;
   }else{
   System.out.println("please provide valid email");
   }
   
if(password != null){
   pwd=password;
   ispasswordValid=true;
   }else{
   System.out.println("please provide valid password");
   }
   
  isSignInCreated=true;
 
 return isSignInCreated;
 }
 
 public static void readSignIn(){
 System.out.println("fullName is :" +fName);
 System.out.println("contactNumber is :" +contactNo);
 System.out.println("email is :" +emailId);
 System.out.println("password is :" +pwd);
 }
 }
 
