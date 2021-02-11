class harjoitus12
{
	public static void main(String[]args)
	{
	double tuntipalkka;
	double tyotunnit;
	double veroprosentti;
	
	System.out.println("Mika on tuntipalkka?");
	tuntipalkka=Lue.dluku();
	System.out.println("Anna tyotuntien maara");
	tyotunnit=Lue.dluku();
	System.out.println("Anna veroprosentti");
	veroprosentti=Lue.dluku();
	
	double bruttotulo=(tyotunnit*tuntipalkka);
	

	double nettotulo=(bruttotulo-(100/veroprosentti));
	
	double vero=(bruttotulo-nettotulo);
	
	System.out.println(bruttotulo);
	System.out.println(nettotulo);
	System.out.println(vero);
	}
}