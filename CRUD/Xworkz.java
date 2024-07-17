class Xworkz{
static String fName;
static String contactNo;
static String rollNo;
static String yearOfPassing;
static String emailId;
public static boolean registration(String fullName,String contactNumber,String usn,String yop,String email)
{
boolean isregistrationCreated=false;
boolean isfullNameValid=false;
boolean iscontactNumberValid=false;
boolean isusnValid=false;
boolean isyopValid=false;
boolean isemailValid=false;



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
   
if(usn != null){
   rollNo=usn;
   isusnValid=true;
   }else{
   System.out.println("please provide valid usn");
   }
   
if(yop != null){
   yearOfPassing=yop;
   isyopValid=true;
   }else{
   System.out.println("please provide valid yop");
   }
   
if(email != null){
   emailId=email;
   isemailValid=true;
   }else{
   System.out.println("please provide valid email");
   }
   
  isregistrationCreated=true;
  
 return isregistrationCreated;
 }
 public static void readregistration(){
 
 System.out.println("fullName is :" +fName);
 System.out.println("contactNumber is :" +contactNo);
 System.out.println("usn is :" +rollNo);
 System.out.println("yop is :" +yearOfPassing);
 System.out.println("email is :" +emailId);
 }
 }
 
 
 