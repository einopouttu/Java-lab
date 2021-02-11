class harjoitus23b
{
	public static void main(String[]args)
	{
	String nimi;
	int laskuri;
	System.out.println("Anna nimi");
	nimi=Lue.rivi();
	System.out.println("Kuinka monesti tulostetaan?");
	laskuri=Lue.kluku();
	
	for(int i=1; i<=laskuri; i++)
	{
	System.out.println(i + "." + nimi);
	}
	}
}