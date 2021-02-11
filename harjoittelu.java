class harjoittelu
{
	public static void tulosta(){
	System.out.println("Eino");
	System.out.println("Vaasa");
	
	}	
	public static void main(String[]args){
	tulosta();
	System.out.println(teejotain());
	System.out.println("Anna summa");
	int summa=Lue.kluku();
	System.out.println(ruho(summa));
	System.out.println("Anna 1.luku");
	int luku1=Lue.kluku();
	System.out.println("Anna 2.luku");
	int luku2=Lue.kluku();
	System.out.println(eikka(luvut));
	}
	public static String teejotain()
	{
		return "mustan kissan paksut posket";
		
	}
	public static double ruho(int summa){
		return summa*0.22;
		
	}
	public static int eikka(int luvut){
		return luku1*luku2;
	}
}