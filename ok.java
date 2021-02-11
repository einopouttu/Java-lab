class ok
{
	public static void main(String[]args)
	{
		int summa=0;
		int laskin=0;
		int luku;
	
	do
	{
		System.out.println("Anna luku");
		luku=Lue.kluku();
		summa=summa+luku;
		laskin++;
	}
	
	while(summa<=50);
	
	System.out.println("lukujen summa oli " + summa + " ja lukuja oli " + laskin);
	
	}
}