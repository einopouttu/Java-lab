class harjoitus26
{
	public static void main(String[]args)
	{
	int miehetlkm=0, naisetlkm=0;
	
	
	char sukupuoli;
	
	for(int m=1; m<=10; m++)
	{
	System.out.println("Mies/nainen?");
	sukupuoli=Lue.merkki();
	if(sukupuoli=='m')
		miehetlkm++;
	else naisetlkm++;
	}
	System.out.print("Miehet");
	for(int i=0; i<miehetlkm; i++)
	{
		System.out.print("*");
	}
	System.out.print("\nNaiset");
for(int i=0; i<naisetlkm; i++)
{
System.out.print("*");	
}
	}		
}