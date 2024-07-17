class GoldShopRunner{
public static void main(String args[])
{
boolean isgoldNameAdded = GoldShop.createaddGoldItem("gold necklace");
System.out.println("The item added is:" +isgoldNameAdded);

isgoldNameAdded = GoldShop.createaddGoldItem("gold earrings");
System.out.println("The item added is:" +isgoldNameAdded);

isgoldNameAdded = GoldShop.createaddGoldItem("gold bangles");
System.out.println("The item added is:" +isgoldNameAdded);

isgoldNameAdded = GoldShop.createaddGoldItem("men gold chain");
System.out.println("The item added is:" +isgoldNameAdded);


isgoldNameAdded = GoldShop.createaddGoldItem("nose pin");
System.out.println("The item added is:" +isgoldNameAdded);

isgoldNameAdded = GoldShop.createaddGoldItem("bracelets");
System.out.println("The item added is:" +isgoldNameAdded);

isgoldNameAdded = GoldShop.createaddGoldItem("pendants");
System.out.println("The item added is:" +isgoldNameAdded);

GoldShop.getGoldItem();

        
		boolean updateditems = GoldShop.updateGolditem("nose pin","ring");
        System.out.println("The updated value is"+updateditems); 
        GoldShop.getGoldItem();
		

}
}
