import hsa.Console;
class Desempenio6cClase1
{
static Console c;
public static void main (String arg [])
{
float precio, descuento, contado;
String nombre;
c = new Console ();
c.println("Ingrese el nombre del producto: ");
nombre = c.readLine();
c.println("Ingrese el precio del producto: ");
precio = c.readFloat();
descuento = (precio*10)/100;
contado = precio - descuento;
c.println ("Precio del producto con descuento del 10% por pago en contado: " + contado);
}
}
