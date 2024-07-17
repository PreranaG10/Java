class Sport{
static String iplTeamNames[]={"Royal Challengers Bengaluru", "Chennai Super Kings", "Mumbai Indians", "Kolkata Knight Riders", "Sunrises Hyderabad", "Rajastan Royals", 
"Delhi Capitals", "Gujarat Titans", "Lucknow Super Giants", "Punjab Kings"};
static String top10Bowlers[]={"Piyush chawla", "Dwayne Bravo", "Bhuvneshwar", "Sunil Narine", "Ravichandran Ashwin", "Amit Mishra", "Lasith Malinga", "jasprit Bumrah",
"Ravindra Jadeja", "Umesh Yadav"};
static String top10Batsman[]={"Virat Kohli", "Ruturaj Gaikwad", "Riyan Parag", "Travis Head", "Sanju Samson", "Sai Sudharshan", "KL Rahul", "Nicholas Pooran", "Sunil Narine",
"Abhishek Sharma"};
static String iccTeamNames[]={"Australia", "Bangladesh", "England", "India", "New Zealand", "South Africa", "Pakistan", "SriLanka", "West Indies", "Zimbabwe", "Bermuda",
"canada", "Ireland", "kenya", "Netherlands", "scotland", "Hong KOng", "Namibia", "Denmark", "Bahamas"};
public static void main(String args[]){
System.out.println("The available iplTeamNames are:" + iplTeamNames.length);
for (int index = 0 ;   index <= iplTeamNames.length -1 ;   index++  ){
System.out.println(iplTeamNames[index]);
}
System.out.println("The available top10Bowlers are:" + top10Bowlers.length);
for (int index = 0 ;   index <= top10Bowlers.length -1 ;   index++  ){
	System.out.println(top10Bowlers[index]);
}
System.out.println("The available top10Batsman are:" + top10Batsman.length);
for (int index = 0 ;   index <= top10Batsman.length -1 ;   index++  ){
	System.out.println(top10Batsman[index]);
}
System.out.println("The available iccTeamNames are:" + iccTeamNames.length);
for (int index = 0 ;   index <= iccTeamNames.length -1 ;   index++  ){
	System.out.println(iccTeamNames[index]);
}
}	
}


