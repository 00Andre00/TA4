package clase1;
public class Universidad {

    public String nombre;
    public String direccion;
    public String ciudad;

    public Universidad(String nom, String direc, String ciu)
    {
        establecerNombre(nom);
        establecerDireccion(direc);
        establecerCiudad(ciu);
    }

    public String obtenerNombre()
    {
        return nombre;
    }

    public void establecerNombre(String nom)
    {
        nombre = nom;
    }
    public String obtenerDireccion()
    {
        return direccion;
    }
    public void establecerDireccion(String direc)
    {
        direccion=direc;
    }
    public String obtenerCiudad()
    {
        return ciudad;
    }
    public void establecerCiudad(String ciu)
    {
        ciudad=ciu;
    }

    void enseniar()
    {
        System.out.println("Enseñan calculo");
    }
    public static void main(String[] args) {
        Universidad universidad =new Universidad("Udh", "Esperanza","Huanuco" );
        System.out.println("La universidad se llama:" +universidad.obtenerNombre());
        System.out.println("Se ubica en:" +universidad.obtenerDireccion());
        System.out.println("Esta en la ciudad:" +universidad.obtenerCiudad());
    }
}
