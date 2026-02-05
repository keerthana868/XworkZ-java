class ChatShop{
	public static void main(String[] chat){
		String chatNames[] = {"panipuri","masalpuri","tikkipuri","dahipuri","gobi manchuri","pav bhaji","vada pav","sandwitch","chickenroll","egg roll","noodles","egg bonda","egg rice","momos","shawarma"};
		String panipuri = chatNames[0];
		String masalpuri = chatNames[1];
		String dahipuri = chatNames[2];
		String tikkipuri = chatNames[3];
		String gobiManchuri = chatNames[4];
		String pavBhaji = chatNames[5];
		String vadaPav = chatNames[6];
		String sandwitch = chatNames[7];
		String chickenRoll = chatNames[8];
		String eggRoll = chatNames[9];
		String noodles = chatNames[10];
		String eggBonda = chatNames[11];
		String eggRice = chatNames[12];
		String momos = chatNames[13];
		String shawarma = chatNames[14];
		
		System.out.println("The no of chats are" + chatNames.length);
		System.out.println("Chats list is as follows:");
		System.out.println(panipuri+ " " +masalpuri+ " "+tikkipuri+ " " +dahipuri+ " " +gobiManchuri+ " " +pavBhaji+ " " +vadaPav+ " " +sandwitch+ " "+chickenRoll+ " " +eggRoll+ " " +noodles+ " " +eggBonda+ " " +eggRice+ " " +momos+ " " +shawarma);
		for(String chatName:chatNames){
			System.out.println(chatName);
		}
	}
}