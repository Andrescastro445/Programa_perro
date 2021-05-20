public class Perro
{
    //Atributos
    int ID;
    String Raza;
    int Precio;
    //Metodo Constructor
    public Perro (int ID, String Raza, int Precio)
    {
        this.ID = ID;
        this.Raza = Raza;
        this.Precio = Precio;
    }
    //Metodos
    public void correr ()
    {
        System.out.println ("Perro corriendo...");
    }
    public void datos ()
    {
        System.out.println ("ID: "+ID);
        System.out.println ("Raza: "+Raza);
        System.out.println ("Precio: "+Precio);
    }
}
