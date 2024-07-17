class BlinkIt{
	
public static double bfood(String foodName){


if(foodName == "masala uttapam"){
       return 200.00;
}else if(foodName == "jowar upma"){
       return 50.00;
}else if(foodName == "green curry"){
       return 220.00;
}else if(foodName == "panipuri"){
       return 60.00;  
}else if(foodName == "samosa"){
       return 50.00;
}else if(foodName == "paneer"){
       return 260.00;
}else if(foodName == "Chicken"){
       return 180.00;
}else if(foodName == "Coke"){
       return 105.00;
}else if(foodName == "bread pakoda"){
       return 95.00;
}else if(foodName == "toast"){
       return 45.00;
}else if(foodName == "chocolates"){
       return 20.00;
}else if(foodName == "tea"){
       return 40.00;
}else if(foodName == "CuppuccinoCoffee"){
       return 201.90;
}else if(foodName == "french toast"){
       return 85.00;
}else if(foodName == "chilly cheese and sandwich"){
       return 110.00;
}else{
System.out.println("the food not found");
return 0.00;
}

}

}