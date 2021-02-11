class harjoitus28
{
	public static void main(String[]args)
	{
	int luku;
	System.out.println("Anna luku");
	luku=Lue.kluku();
	do
	{System.out.println("Syottamasi luku oli: "+ luku);
	System.out.println("Anna luku");
	luku=Lue.kluku();
	}
	while (luku<49 || luku%2!=1 || luku>100);
	System.out.println("Syottamasi luku oli: "+ luku);
	
	}
	
}