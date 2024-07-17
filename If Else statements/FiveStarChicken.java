class FiveStarChicken{
public static double takeOrder(String foodName){

if(foodName=="chessy chicken"){
	return 55.00;
}
if(foodName=="chicken Nuggets"){
	return 45.00;
}
if(foodName=="chicken fingers"){
	return 75.00;
}
if(foodName=="chicken popcorn"){
	return 100.00;
}
if(foodName=="mini samosa"){
	return 150.00;
}
if(foodName=="chicken strips"){
	return 200.00;
}
if(foodName=="paneer roll"){
	return 55.00;
}
if(foodName=="paneer burger"){
	return 60.00;
}
if(foodName=="hot crispy burger"){
	return 75.00;
}
else
System.out.println("food Not Found");
return 0.00;
}
}