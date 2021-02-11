class harjoitus31
{
	public static void main(String[]args)
	{
	double [][] luvut=new double[2][3];
	for(int i=0; i<2; i++){
		for (int j=0; j<3; j++)
		{
		System.out.println("Anna luku");
		luvut[i] [j]=Lue.dluku();
	}
	}
	for(int i=0; i<2;i++)
	{
	for (int j=0; j<3; j++){
	System.out.print(luvut [i][j]+"\t");

	}
	System.out.println( );
	}
	}
}