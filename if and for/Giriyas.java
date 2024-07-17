class Giriyas{
	static String appliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
static int index;
	public static boolean createHomeAppliance(String appliance){
		boolean isCreateHomeAppliance=false;
		System.out.println("createHomeAppliance started");
			if(appliance != null){
				appliances[index] = appliance;
				index++;
				isCreateHomeAppliance = true;
			}
			else System.out.println("Null value can't consider as a appliance name");
		
		System.out.println("createHomeAppliance ended");
	return isCreateHomeAppliance;
	}

	public static void getHomeAppliances(){
		for(String item : appliances)
			System.out.println("Appliances available here are:"+item);

	}

}