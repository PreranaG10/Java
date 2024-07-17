class Swiggy{
//method declaration	
public static double takeOrder(String foodName){


if(foodName == "Pizza"){
       return 99.00;
}else if(foodName == "Dosa"){
       return 60.00;
}else if(foodName == "masala Dosa"){
       return 75.00;
}else if(foodName == "Set Dosa"){
       return 80.00;  
}else if(foodName == "PrawnsFry"){
       return 350.00;
}else if(foodName == "SheekKabab"){
       return 260.00;
}else if(foodName == "Roti"){
       return 30.00;
}else if(foodName == "Coke"){
       return 105.00;
}else if(foodName == "Idly"){
       return 40.00;
}else if(foodName == "Rava idly"){
       return 45.00;
}else if(foodName == "Mushroom biryani"){
       return 150.00;
}else if(foodName == "gobi"){
       return 291.43;
}else if(foodName == "Coffee"){
       return 35.90;
}else if(foodName == "FushionShawarma"){
       return 85.00;
}else if(foodName == "chole bhuture"){
       return 50.00;
}else{
System.out.println("the food not found");
return 0.00;
}
public static double takeOrder(String foodName,int quantity){
double price = 0.0;
if(foodName == "pizza"){
price = 99.00 * quantity;
return price;

}

}