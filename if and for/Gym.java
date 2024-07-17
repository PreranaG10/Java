import java.util.*;
class Gym{
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int Index;
	public static boolean gymEquipment(String gymEquipment){
	boolean isgymEquipmentcreated= false;
	
        	if(gymEquipment!=null)
	       {
	        gymEquipments[Index]=gymEquipment;
	        Index++;
	        isgymEquipmentcreated = true;
	    }else{
	    System.out.println("gymEquipment  not found");
	
	   }
       return isgymEquipmentcreated;
        }
	
public static void getGymEquipmentName()
{
for(String gymEquipment:gymEquipments)
System.out.println(gymEquipment);
}

public static boolean updatedItem(String oldgymEquipments, String newgymEquipments)
{
	boolean isItemCreated = false;
	for(int index = 0;index<gymEquipments.length;index++)
	{
		if(oldgymEquipments == gymEquipments[index]){
			gymEquipments[index] = newgymEquipments;
		}
		isItemCreated = true;
	}
	if(isItemCreated ==  false){
		System.out.println("gymEquipments not found");
	}
	return isItemCreated;
}

public static boolean deletegymEquipments(String gymEquipmentTobeDeleted){
	boolean isgymEquipmentDeleted=false;
	System.out.println("deletegymEquipments is started");
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0; oldIndex < gymEquipments.length; oldIndex++){
		if(gymEquipments[oldIndex] != gymEquipmentTobeDeleted)
		{
			gymEquipments[newIndex] = gymEquipments[oldIndex];
			 newIndex++;
		 }
	 }
	gymEquipments =Arrays.copyOf(gymEquipments,newIndex);
	 if(gymEquipments != null){
		isgymEquipmentDeleted =true;
	 }
	 if(isgymEquipmentDeleted == false){
	 System.out.println("deletegymEquipments not found");
	 System.out.println("deletegymEquipments is ended");
	 }
	 return isgymEquipmentDeleted;
}
}


