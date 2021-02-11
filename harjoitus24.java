class harjoitus24
{
	public static void main(String[]args)
	{
	int lkmjaa=0, lkmei=0, lkmtyhja=0;
	String aani;

	for(int i=0; i<9; i++){
		System.out.println("Anna aani");
		aani=Lue.rivi();
		if(aani.equals("jaa"))
		{
		lkmjaa++;
		
		
		}else if(aani.equals("ei"))
		{
			lkmei++;
			
		}else{
			lkmtyhja++;
			
		}
	System.out.println("Annoit aanen");
	}System.out.print("jaa aanet" + lkmjaa);
	System.out.print("ei aanet" + lkmei);
	System.out.println("tyhja-aanet" + lkmtyhja);
}
	
	
}