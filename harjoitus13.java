class harjoitus13
{
	public static void main (String[]args)
	{
		System.out.println("Anna 1. luku:");
		double luku1=Lue.dluku();
		System.out.println("Anna 2. luku:");
		double luku2=Lue.dluku();
		System.out.println("lukujen " + luku1 + " ja " + luku2 + " summa on " + (luku1+luku2));
		System.out.println("lukujen " + luku1 + " ja " + luku2 + " erotus on " + (luku1-luku2));
		System.out.println("lukujen " + luku1 + " ja " + luku2 + " tulo on " + (luku1*luku2));
		System.out.println("lukujen " + luku1 + " ja " + luku2 + " osamaara on " + (luku1/luku2));
		System.out.println("lukujen " + luku1 + " ja " + luku2 + " jakojaannos on " + (luku1%luku2));
	}
}
