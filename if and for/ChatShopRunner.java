class ChatShopRunner {
    public static void main(String chatItems[]) {
        boolean isAdded = ChatShop.createChatShop("masala puri");
        System.out.println("The item was added: " + isAdded);
       
        isAdded = ChatShop.createChatShop("gobi");
        System.out.println("The item was added: " + isAdded);
        
        isAdded = ChatShop.createChatShop("chips");
        System.out.println("The item was added: " + isAdded);
        

        isAdded = ChatShop.createChatShop("mushroom");
        System.out.println("The item was added: " + isAdded);
        
        isAdded = ChatShop.createChatShop("baby corn");
        System.out.println("The item was added: " + isAdded);
        
        isAdded = ChatShop.createChatShop("pani puri");
        System.out.println("The item was added: " + isAdded);
        

        //
		ChatShop.getShopName();
        
		boolean updateditems = ChatShop.updateChatNames("pani puri","samosa masala");
        System.out.println("The updated value is"+updateditems); 
        ChatShop.getShopName();
		
		boolean deleteditem = ChatShop.deleteChatName("baby corn");
		System.out.println("The deleted value is:" +deleteditem);
		ChatShop.getShopName();
		
    }
}



