import hsa.Console;
class Desempenio6Clase1
{
static Console c;
public static void main (String arg [])
{
int n1, n2, suma, producto;
c = new Console ();
c.print ("Ingrese el primer numero: ");
n1 = c.readInt();
c.print ("Ingrese el segundo numero: ");
n2 = c.readInt ();
c.println ();
suma = n1 + n2;
c.println ();
producto = n1 * n2;
c.print ("La suma de los numeros es: " + suma);
c.println();
c.print ("El producto de los numeros es: " + producto);
}
}
