class harjoitus23a
{
	public static void main(String[]args)
	{	
		String nimi;
		int laskuri;
		System.out.println("Anna nimi");
		nimi=Lue.rivi();
		System.out.println("Kuinka monesti tulostetaan?");
		laskuri=Lue.kluku();
		
		for(int i=0; i<laskuri; i++)
		{
		System.out.println(nimi);
		}
	}
}