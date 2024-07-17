class FiveStarChickenRunner{
public static void main(String args[]){
System.out.println("main started");
//method name=class.method
double takeOrder=FiveStarChicken.takeOrder("chessy chicken");
System.out.println("main ended");
System.out.println("price is "+takeOrder);
}
}