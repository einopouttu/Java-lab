class hk
{
	public static void main(String[]args)
	{
		System.out.println("Anna rivien maara");
		int rivit=Lue.kluku();
		System.out.println("Anna sarakkeet");
		int sarakkeet=Lue.kluku();
		int [][] taulukko=new int[rivit][sarakkeet];
	
		for(int i=0; i<rivit; i++)
		{
			for(int j=0; j<sarakkeet; j++)
			{
			System.out.println("Anna alkiolle arvo");
			int arvo=Lue.kluku();
			taulukko[i][j]=arvo;
			}
		}
		for(int i=0; i<rivit; i++)
		{
			for(int j=0; j<sarakkeet; j++)
			{
			System.out.print(taulukko[i][j] + "  ");
			}
			System.out.println();
		}
	}
}