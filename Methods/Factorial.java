class Factorial{
public static int toGetfact( int factorialNumber)g
{
int fact = 1;
for(int num=1;num<=factorialNumber;num++)
{
fact = num*fact;
}
System.out.println("The factorial number:" + factorialNumber+ "is" +fact);
return fact;
}
}
