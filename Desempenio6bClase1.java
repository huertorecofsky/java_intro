import hsa.Console;
class Desempenio6bClase1
{
static Console c;
public static void main (String arg [])
{
float b, h, superficie;
c = new Console();
c.println ("Ingrese la base del triangulo: ");
b = c.readFloat ();
c.println("Ingrese la superficie del triangulo: ");
h = c.readFloat();
superficie = b*h/2;
c.println("La superficie del triangulo es: " + superficie + "cm");
}
}
