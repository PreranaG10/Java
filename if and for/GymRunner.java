class GymRunner{
   public static void main(String Equipment[]){
       boolean isGetEquipment =Gym.gymEquipment("Treadmill"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	   
	   isGetEquipment =Gym.gymEquipment("Elliptical Trainer"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	   
	   isGetEquipment =Gym.gymEquipment("Stationary Bike"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	   
	   isGetEquipment =Gym.gymEquipment("Rowing Machine"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	   
	   isGetEquipment =Gym.gymEquipment("Stair Climber"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	   
	   isGetEquipment =Gym.gymEquipment("Smith Machine"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	   
	   isGetEquipment =Gym.gymEquipment("Leg Curl Machine"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	   
	   isGetEquipment =Gym.gymEquipment("dumbbells"); 
       System.out.println("The gymEquipment name is "+isGetEquipment);
	  
	   
	   boolean isUpdatedItem = Gym.updatedItem("Smith Machine","Bar Bells");
	   System.out.println("The updated names are " +isUpdatedItem);
	   Gym. getGymEquipmentName();
	   
	   boolean deleteditem = Gym.deletegymEquipments("Stair Climber");
		System.out.println("The deleted value is:" +deleteditem);
		Gym.getGymEquipmentName();
		
	   }
	  



}