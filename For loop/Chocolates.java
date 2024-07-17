class Chocolates{
static String Chocolates[]={"kit kat","DairyMilk","Temptation","Munch","Safari","Perk","5star"};
static String Perfumes[]={"yardley","Engage"};
public static void main(String args[]){
System.out.println("The available Chocolates are;");
for(int index=0; index <Chocolates.length; index++)
{
System.out.println(Chocolates[index]);
}
}
}

//for each loop
for(String Chocolate :Chocolates){
	System.out.println(Chocolate);
}