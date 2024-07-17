class SuperMarket {

  static  String SuperMarketitems[] = {"rice" , "coffee" , "bread" , "sugar" , "bread" , "clothes" , "snacks","eggs"};
	
 public static void main(String args[]){
 
     System.out.println("The Available SuperMarketitems are: " + SuperMarketitems.length);
	 for (int index = 0 ;   index <= SuperMarketitems.length-1;   index++  ){
		 System.out.println(SuperMarketitems[index]);
	 }
 }
}