class harjoitus27
{
public static void main(String[]args)
{
 
int luku1, luku2;
System.out.println("Anna 1.luku");
luku1=Lue.kluku();
System.out.println("Anna merkki");
char valinta = Lue.merkki () ;
System.out.println("Anna 2.luku");
luku2=Lue.kluku();
 switch (valinta)

 {

case '+': System.out.println(luku1 + luku2);
break ;
case '-': System.out.println(luku1 - luku2);
break ;
case '*': System.out.println(luku1 * luku2);
break ;
case '/': System.out.println(luku1 / luku2);
break ;
default: System.out.println(luku1%luku2);
 }
}
}