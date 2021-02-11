class tehtava1

{
	public static void main(String[]args)
	{
		System.out.println("Anna summa");
		summa=Lue.kluku();
		
		int summa2=0;
		
		this.rekursio(summa);
		
	}
	
	private static rekursio (int summa);
	{
		if (summa==0) 
		{
			return 1;
		} 
		else 
		{
			return summa * this.rekursio(summa-1);
		}
	}
}