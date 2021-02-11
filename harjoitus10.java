class harjoitus10
{
	public static void main(String[]args)
	{
	String nimi;
	String yliopisto;
	int ika;
	int lampotila;
	int paino;
	char sukupuoli;
	
	System.out.println("Anna nimesi: ");
	nimi=Lue.rivi();
	System.out.println("Missa yliopistossa opiskelet?");
	yliopisto=Lue.rivi();
	System.out.println("Kuinka monta vuotta olet?");
	ika=Lue.kluku();
	System.out.println("Mika on lampotila?");
	lampotila=Lue.kluku();
	System.out.println("Kuinka paljon painat?");
	paino=Lue.kluku();
	System.out.println("Oletko mies vai nainen?");
	sukupuoli=Lue.merkki();
	}
}