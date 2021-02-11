class jk
{
	public static void main(String[]args)
	{
		String [][] taulukko=new String[3][2];
		
		System.out.println("Anna etunimi1");
		String etunimi1=Lue.rivi();
		System.out.println("Anna sukunimi1");
		String sukunimi1=Lue.rivi();
		
		taulukko[0][0]="etunimi1";
		taulukko[0][1]="sukunimi1";
		System.out.println(taulukko[0][0] + taulukko[0][1]);
	}
}