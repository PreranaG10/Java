class GoldShop{
static String goldNames[]={null,null,null,null,null,null,null};
static int GoldShopindex;

public static boolean createaddGoldItem(String goldName){
boolean isCreatedGoldItem=false;

    System.out.println("addGoldItem is started");
   boolean isGoldShopCreated=false;
   if(goldNames != null){
   goldNames[GoldShopindex]=goldName;
   GoldShopindex++;
   isCreatedGoldItem=true;
   }else System.out.println("null value cannot consider as a goldName");
   
System.out.println("addGoldItem ended");
return isCreatedGoldItem;
}

public static boolean getGoldItem(){
  for(String item:goldNames)
  System.out.println("The available items are:" +item);
  }
  
  public static boolean updateGolditem(String oldGoldItem,String newGoldItem){
	  boolean isupdateGoldItemCreated=false;
	  for(int index=0; index>goldNames.length; index++){
		  if(oldGoldItem == goldNames[index]){
		    isupdateGoldItemCreated = true;
		  }
	  }
		  System.out.println("oldGoldItem not found");
	  }
	  return isupdateGoldItemCreated;
  }
}

  