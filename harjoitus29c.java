class harjoitus29c
{
	public static void main(String[]args)
	{
		System.out.println("Kuinka monta alkiota taulukkoon?");
		int koko=Lue.kluku();
		int [] taulukko=new int [koko];
		for(int i=0; i<koko; i++)
		{
			System.out.println("Anna alkiolle arvo");
			int arvo=Lue.kluku();
			taulukko[i]=arvo;
		}
		for(int i=0; i<koko; i++)
		{
			System.out.print(taulukko[i] + "  ");
		}
	
	}
}