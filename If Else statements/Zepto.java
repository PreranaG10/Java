class Zepto{
	
public static double zfood(String foodName){


if(foodName == "fried rice"){
       return 120.00;
}else if(foodName == "sweet and sour chicken"){
       return 230.00;
}else if(foodName == "green curry"){
       return 220.00;
}else if(foodName == "ChickenBiryani"){
       return 295.00;  
}else if(foodName == "salsa"){
       return 350.00;
}else if(foodName == "badam kheer"){
       return 260.00;
}else if(foodName == "Chicken"){
       return 180.00;
}else if(foodName == "Coke"){
       return 105.00;
}else if(foodName == "dal makhani"){
       return 95.00;
}else if(foodName == "Nuggets"){
       return 423.00;
}else if(foodName == "chocolates"){
       return 20.00;
}else if(foodName == "LotusBiscoff"){
       return 291.43;
}else if(foodName == "CuppuccinoCoffee"){
       return 201.90;
}else if(foodName == "FushionShawarma"){
       return 85.00;
}else if(foodName == "amul frozen rasmalai"){
       return 110.00;
}else{
System.out.println("the food not found");
return 0.00;
}

}

}