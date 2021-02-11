class apu
{
	public static void eino()
	{
		System.out.println("Eino");
		System.out.println("Vaasa");
	}
	public static String mejo()
	{
		return "Mustan kissan paksut posket";
	}
	public static void alv()
	{
		System.out.println("Anna summa");
		double summa=Lue.dluku();
		System.out.println(summa*0.22);
		
	}
	public static int kerto()
	{
		System.out.println("Anna 1. luku");
		int luku1=Lue.kluku();
		System.out.println("Anna 2. luku");
		int luku2=Lue.kluku();
		return luku1*luku2;
		
	}
}